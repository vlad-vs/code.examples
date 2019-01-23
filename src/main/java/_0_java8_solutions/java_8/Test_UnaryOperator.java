package _0_java8_solutions.java_8;

import java.util.function.UnaryOperator;

public class Test_UnaryOperator {
    public static void main(String[] args) {
        int c = 5;
        int y = 3;

        UnaryOperator<Integer> square = x -> x*x;
        UnaryOperator<Integer> square2 = x -> x*y;
        System.out.println(square.apply(5)); // 25

        System.out.println(square2.apply(2));


    }
}
