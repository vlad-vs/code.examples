package _0_java8_solutions.java_8;

import java.util.Optional;

public class Test_Optional {
    public static void main(String[] args) {

//        String s = new String("Hello");
        String s = null;

//        Optional<String> stringOptional = Optional.empty();
        final Optional<String> s1 = Optional.ofNullable(s);
        System.out.println(s1.isPresent());

//        System.out.println(s1.get());

//        boolean present = stringOptional.isPresent();
//        System.out.println(present);
    }
}
