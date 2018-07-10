package my.examples.java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Test_Predicate {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        Predicate<Integer> bigger = z -> a < b;

        System.out.println(bigger.test(1));

        List<String> st = new ArrayList<>();
        st.add("hello");
        System.out.println(st);
        System.out.println(st.isEmpty());

    }
}
