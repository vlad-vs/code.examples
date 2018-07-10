package my.examples.java_8;

import java.util.function.UnaryOperator;

public class Test_UnaryOperator {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println(square.apply(5)); // 25
    }
}
