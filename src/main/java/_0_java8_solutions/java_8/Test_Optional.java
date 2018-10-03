package _0_java8_solutions.java_8;

import java.util.Optional;

public class Test_Optional {
    public static void main(String[] args) {

        String s = new String();

        Optional<String> stringOptional = Optional.empty();

        boolean present = stringOptional.isPresent();
        System.out.println(present);
    }
}
