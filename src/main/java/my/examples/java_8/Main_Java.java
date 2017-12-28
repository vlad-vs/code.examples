package my.examples.java_8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class Main_Java {

	public static void main(String[] args) {

		CalrulateTestInterface f = new CalrulateTestInterface() {

			@Override
			public int calculate(int a) {
				return a+a;
			}
		};
		System.out.println(f.calculate(3));
		System.out.println(f.dubleS(2));



		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

//		Collections.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String a, String b) {
//				return a.compareTo(b);
//			}
//		});

		Collections.sort(names,(a, b) -> a.compareTo(b));


//		for (String s:names) {
//			System.out.println(s);
//		}

		System.out.println("=================================");

		names.forEach(s -> System.out.println(s));

		Supplier<Person> personSupplier= Person::new;

		Person person = personSupplier.get();


	}
}
