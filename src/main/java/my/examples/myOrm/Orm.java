package my.examples.myOrm;

import lombok.extern.log4j.Log4j;
import my.examples.configReader.Config;
import my.examples.configReader.ConfigReader;
import my.examples.myOrm.creators.ClassGetter;
import my.examples.myOrm.creators.TableCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component("orm")
@Log4j
public class Orm {
    @Autowired
    private ConfigReader configReader; 

    //1) получить пути всех классов (наименование)
    //2) по ним найти все аннотации
    //3) из наннотаций получить инфу по полю
    //4) создать sql

//    public static void main(String[] args) {
//        String path = "src/main/java/my.examples.myOrm/dto";
//        String pag = "my.examples.myOrm.dto";
////      List<String> strings = Lists.newArrayList("MyOrm.pojo.Person");
//        List<String> classNames = getClassNames(path,pag);
//        try {
//            String tables = TableCreator.createTables(classNames);
//            System.out.println("SQL : " + tables);
//        } catch (ClassNotFoundException e) {
//            System.out.println("Path not found");
//        }
//    }
    
    
    public void createTables(){
        final List<Config> configs = configReader.getConfigs();
        final Optional<Config> pathOpt = configs.stream().filter(x -> x.getName().equals("path")).findFirst();
        final Optional<Config> pagOpt = configs.stream().filter(x -> x.getName().equals("pag")).findFirst();
        if (!pagOpt.isPresent() || !pathOpt.isPresent()){
            log.error("configs error");
            System.out.println("configs error");
            throw new RuntimeException("configs error");
        }
        final Config path = pathOpt.get();
        final Config pag = pagOpt.get();
        
        final List<String> classNames = getClassNames(path.getValue(), pag.getValue());
        try {
            String tables = TableCreator.createTables(classNames);
            System.out.println("SQL : " + tables);
        } catch (ClassNotFoundException e) {
            System.out.println("Path not found");
        }
    }

    private List<String> getClassNames(String path,String pag) {
        List<Class<?>> myOrm = ClassGetter.processDirectory(new File(path), pag);
        return myOrm.stream().map(Class::getName).collect(Collectors.toList());
    }

}
