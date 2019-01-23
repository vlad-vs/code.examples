package _0_java8_solutions.java_8;

import com.google.inject.internal.util.Lists;
import _0_java8_solutions.java_8.suplier.Person;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.partitioningBy;

public class Test_Streem_2 {



    public static void main(String[] args) {

        List<Integer>  arList = Lists.newArrayList(4, 5, 6, 6, 7, 8);
        int i1 = arList.stream().limit(arList.size() / 2).collect(Collectors.averagingInt(x -> x)).intValue();
        int i2 = arList.stream().skip(arList.size() / 2).collect(Collectors.averagingInt(x -> x)).intValue();
        System.out.println(Collections.max(Lists.newArrayList(i1, i2)));

        System.out.println("====================================================================================");

        int i3 = arList.stream().skip(arList.size() / 2).reduce((acc,x)-> acc + x).get() / (arList.size()/2);
        int i4 = arList.stream().limit(arList.size() / 2).reduce((acc,x)-> acc + x).get() / (arList.size()/2);
        Integer integer = Stream.of(i3, i4).max(Integer::compare).get();
        System.out.println(integer);

        System.out.println("====================================================================================");

        OptionalDouble average1 = arList.stream().limit(arList.size() / 2).mapToInt(x -> x).average();
        OptionalDouble average2 = arList.stream().skip(arList.size() / 2).mapToInt(x -> x).average();
        int res = Stream.of(average1.getAsDouble(), average2.getAsDouble()).max(Double::compare).get().intValue();
        System.out.println(res);

        System.out.println("====================================================================================");


        System.out.println("====================================================================================");


        System.out.println(
                Stream.of((arList.stream().limit(arList.size() / 2).mapToInt(x -> x).average()).getAsDouble(), (arList.stream().skip(arList.size() / 2).mapToInt(x -> x).average()).getAsDouble())
                .max(Double::compare).get().intValue()
        );

        System.out.println("====================================================================================");

        System.out.println(arList.spliterator().trySplit().characteristics());

        System.out.println("====================================================================================");



//        Integer[] mas = {2, 5, 7, 8, 3, 0};
//        List<Integer>  arList = Arrays.asList(mas);

//        List<String> l1  = new ArrayList<String>(Arrays.asList(array));    // Java 1.5 to 1.6
//        List<String> l1b = new ArrayList<>(Arrays.asList(array));          // Java 1.7+
//        List<String> l2  = new ArrayList<String>(Arrays.asList("a", "b")); // Java 1.5 to 1.6
//        List<String> l2b = new ArrayList<>(Arrays.asList("a", "b"));       // Java 1.7+
//        List<T> l3 = Lists.newArrayList(i1, i2);
//        List<Element> elements = List.of(new Element(1), new Element(2), new Element(3));// Java 1.9+

//        System.out.println(arList.stream().collect(Collectors.summarizingInt((p) -> p + 3)).getAverage());
//        System.out.println(arList.stream().limit(mas.length / 2).collect(Collectors.toList()));
//        System.out.println(arList.stream().limit(mas.length / 2).mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average());

//        Lists.newArrayList(i1, i2).stream().filter(x -> x > y);
        Person person = new Person("Tom",25);





//        Stream.of(i1,i2).(n) -> n::max);

//        arList.stream().flatMap((x) -> Arrays.asList(x. mas.length / 2));
//        arList.stream().flatMap((p) -> Arrays.asList(p.split()).stream()).toArray(String[]::new);
//        Optional<Integer> maxValue = arList.stream().max(Integer::compareTo);

//        arList.stream().collect(partitioningBy(s -> s));

//        Stream.of(mas).collect(partitioningBy(s -> s.longValue().))
//        arList.stream().;
//        List names = entitys.stream()
//                .map(Entity::getName)
//                .collect(Collectors.toList());


        List<Integer>  arList2 = Lists.newArrayList(4, 5, 6, 6, 7, 8);

//        Phone[] phones = new Phone[]{new Phone("iPhone 8", 54000),
//                new Phone("Pixel 2", 45000),
//                new Phone("Samsung Galaxy S9", 40000),
//                new Phone("Nokia 9", 32000)};

        System.out.println("==============================================");

        IntStream.range(0, 10)
                .forEach(System.out::println);
        System.out.println("==============================================");
        IntStream.rangeClosed(0, 5)
                .forEach(System.out::println);

        System.out.println("==============================================");

        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        System.out.println(addUp(integerStream));

        List<String> list1 = null;
        List<String> list2 = new ArrayList<>();

        Optional<List<String>> opt1 = Optional.ofNullable(list1);
        Optional<List<String>> opt2 = Optional.ofNullable(list2);

        System.out.println(opt1.isPresent());
//        System.out.println(opt1.get());
        System.out.println(opt2.isPresent());
        System.out.println(opt2.get());



    }

    public static int addUp(Stream<Integer> str){
        return str.reduce(0, (a, b) -> a + b);
    }


}
