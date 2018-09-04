package my.examples.java_8;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Test_Predicate {

    public static void main(String[] args) {
        int a = 7;
        int b = 8;


        Predicate<Integer> bigger = z -> z < b;

        System.out.println(bigger.test(5));





    }
}
