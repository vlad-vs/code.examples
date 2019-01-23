package my.examples.nullAnnotations;

import my.examples.patterns.factoryMethod.Auto;

import javax.annotation.Nonnull;

public class NullMainAn {

    public static void main(String[] args) {

        Auto auto1 = null;
        Auto auto2 = new Auto();

        sayAuto(auto1);
    }

    private static void sayAuto(@Nonnull Auto auto){
        System.out.println("hello");
    }

}
