package _0_java8_solutions;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class ComparingStreams {

    public static void main(String[] args) {

        List<String> strings1 = Lists.newArrayList("1", "2", "3");
        List<String> strings2 = Lists.newArrayList("1","2","4"); // true

        // метод сравнения каждого с каждым
        List<String> collect = strings1.stream()
                .map(s1 ->
                        strings2.stream()
                                .filter(s1::equals))
                .flatMap(stringStream -> stringStream)
                .collect(Collectors.toList());
        System.out.println(collect);

        // метод короче, не использует мапу! метод сравнения каждого с каждым
        List<String> collect3 = strings1.stream()
                .flatMap(s1 ->
                        strings2.stream()
                                .filter(s1::equals))
                .collect(Collectors.toList());
        System.out.println(collect3);

        final long count = strings1.stream()
                .map(s1 ->
                        strings2.stream().filter(s1::equals))
                .flatMap(stringStream -> stringStream)
                .filter(s -> strings2.contains(s))
                .count();

        System.out.println(count);
        System.out.println(strings2.size());
        System.out.println(strings2.size() == count);

    }

}
