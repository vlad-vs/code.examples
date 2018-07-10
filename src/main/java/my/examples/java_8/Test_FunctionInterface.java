package my.examples.java_8;

import java.util.function.Function;

public class Test_FunctionInterface {

//    Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R:
    public static void main(String[] args) {
        Function<Integer, String> convert = x-> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов

        Function<Integer,String> conv = x -> String.valueOf(x * 10);

        System.out.println(conv.apply(2));
    }
}
