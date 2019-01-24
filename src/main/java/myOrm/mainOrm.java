package myOrm;

import myOrm.creators.ClassGetter;
import myOrm.creators.TableCreator;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

public class mainOrm {

    //1) получить пути всех классов (наименование)
    //2) по ним найти все аннотации
    //3) из наннотаций получить инфу по полю
    //4) создать sql

    public static void main(String[] args) {
//      List<String> strings = Lists.newArrayList("MyOrm.pojo.Person");
        List<String> classNames = getClassNames();
        try {
            String tables = TableCreator.createTables(classNames);
            System.out.println("SQL : " + tables);
        } catch (ClassNotFoundException e) {
            System.out.println("Path not found");
        }
    }

    private static List<String> getClassNames() {
//        Package aPackage = Package.getPackage("MyOrm");
//        List<Class<?>> classesForPackage = ClassGetter.getClassesForPackage(aPackage);
//        List<String> collect = classesForPackage.stream().map(aClass -> aClass.getName()).collect(Collectors.toList());

        String path = "C:\\_code\\java\\progects\\code.examples\\src\\main\\java\\myOrm\\dto";
        String pag = "myOrm.dto";

        List<Class<?>> myOrm = ClassGetter.processDirectory(new File(path), pag);
        return myOrm.stream().map(Class::getName).collect(Collectors.toList());
    }

}
