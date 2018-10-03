package _0_java8_solutions;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class ComparingStreams {

    public static void main(String[] args) {

        List<String> strings1 = Lists.newArrayList("1", "2", "3", "5");
        List<String> strings2 = Lists.newArrayList("1", "4"); // true

        // метод сравнения каждого с каждым
        List<String> collect = strings1.stream()
                .map(s1 ->
                        strings2.stream()
                                .filter(s2 -> s1.contains(s2)))
                .flatMap(stringStream -> stringStream)
                .collect(Collectors.toList());
        System.out.println(collect);

        // метод проверки двух массивов по элементно
        boolean b = strings1.stream()
                .map(s1 ->
                        strings2.stream().filter(s1::contains))
                .flatMap(stringStream -> stringStream)
                .anyMatch(x -> !x.isEmpty());
        System.out.println(b);

        // метод короче, не использует мапу! метод сравнения каждого с каждым
        List<String> collect3 = strings1.stream()
                .flatMap(s1 ->
                        strings2.stream()
                                .filter(s2 -> s1.contains(s2)))
                .collect(Collectors.toList());
        System.out.println(collect3);

    }

}
