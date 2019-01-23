package _1_factory_Java8;

public interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);

}
