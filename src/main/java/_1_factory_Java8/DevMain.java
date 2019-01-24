package _1_factory_Java8;

public class DevMain {

    public static void main(String[] args) {
        System.out.println("\n-- Constructor References --");
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Alexander", "Barchuk");
        System.out.println(person);
    }



}
