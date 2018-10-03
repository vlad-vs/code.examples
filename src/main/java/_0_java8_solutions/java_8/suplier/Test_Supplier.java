package _0_java8_solutions.java_8.suplier;

import java.util.function.Supplier;

public class Test_Supplier {

    public static void main(String[] args) {
        Supplier<Person> personSupplier= Person::new;

        Person person = personSupplier.get();
        System.out.println(person);

    }
}
