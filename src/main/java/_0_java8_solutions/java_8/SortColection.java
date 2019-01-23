package _0_java8_solutions.java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortColection {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

//		Collections.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String a, String b) {
//				return a.compareTo(b);
//			}
//		});

        Collections.sort(names,(a, b) -> a.compareTo(b));

        names.forEach(s -> System.out.println(s));

    }
}
