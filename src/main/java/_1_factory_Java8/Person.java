package _1_factory_Java8;

public class Person {

    String firstName;
    String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{firstName: " + firstName + ", lastName: " + lastName + "}";
    }
}
