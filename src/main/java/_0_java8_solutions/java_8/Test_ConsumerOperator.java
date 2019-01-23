package _0_java8_solutions.java_8;

import java.util.function.Consumer;

public class Test_ConsumerOperator {
    //Consumer<T> выполняет некоторое действие над
// объектом типа T, при этом ничего не возвращая:
    public static void main(String[] args) {

        Consumer<Integer> printer = x-> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов

    }
}
