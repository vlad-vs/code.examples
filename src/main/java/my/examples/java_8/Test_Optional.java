package my.examples.java_8;

import java.util.Optional;

public class Test_Optional {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("Hello");
        System.out.println(stringOptional.get());
    }
}
