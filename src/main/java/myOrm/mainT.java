package myOrm;

import myOrm.creators.SqlCrudService;
import myOrm.dto.Person;

import java.lang.annotation.Annotation;

public class mainT {

    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("Tom",10);
        String name1 = person.getClass().getName();
        String name2 = person.getClass().getSimpleName();
        String name3 = person.getClass().getTypeName();
        String name4 = person.getClass().getCanonicalName();
        String name5 = person.getClass().getPackage().getName();
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

//        String tableExist = SqlCrudService.selectItem(name2);
//        System.out.println(tableExist);
//
//        Annotation[] annotations = person.getClass().getAnnotations();
//        for (Annotation annotation : annotations) {
//            System.out.println(annotation);
//
//        }

        SqlCrudService service = new SqlCrudService();
        service.insertItem(person);


    }
}
