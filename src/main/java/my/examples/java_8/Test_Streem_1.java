package my.examples.java_8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toCollection;

public class Test_Streem_1 {

    public static void main(String[] args) {
        Person p1 = new Person("Tom",20);
        Person p2 = new Person("Jon",25);
        Person p3 = new Person("Nick",30);
        Person p4 = new Person("Marry",19);

        Person p5 = new Person("Marry",19);
        Person p6 = new Person("Marry",19);

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        List<Person> persons2 = new ArrayList<>();
        persons2.add(p5);
        persons2.add(p6);


        System.out.println("==========1=============");
//        Stream<Person> personStream = persons.stream().filter(p -> p.age > 21);
        long count = persons.stream()
                .filter(p -> {
                    System.out.println(p.getName());
                    return p.getAge() > 20;})
                .filter(p -> {
//                    System.out.println(p.getName());
                    return p.getName().equals("Nick");} )
                .count();
        System.out.println(count);

        System.out.println("==========2=============");

        List <Person> filtred = persons.stream()
                .filter(p -> p.getAge() > 20)
                .filter(p -> p.getName().equals("Nick") )
                .collect(Collectors.toList());
        System.out.println(filtred);

        System.out.println("===========3============");

        List <String> mup = persons.stream()
                .filter(p -> p.getAge() > 20)
                .map(p -> p.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(mup);

        System.out.println("===========4============");

        List l = Stream.of(persons,persons2)
                .flatMap(n-> n.stream())
                .collect(Collectors.toList());
        System.out.println(l);

        System.out.println("============5===========");

        Stream rStream = Stream.of(persons, persons2)
                .flatMap(n -> n.stream());
        System.out.println(rStream.count());


        System.out.println("===========6============");

        Person person = persons.stream().min(Comparator.comparing(pers -> pers.getAge())).get();
        System.out.println(person);

        System.out.println("===========7============");


        List <String> mup2 = persons.stream()
                .filter(p -> p.getAge() > 20)
                .map(p -> p.getName())
                .collect(Collectors.toList());
        System.out.println(mup2);

        System.out.println("===========8============");
        Person p = null;
        System.out.println(com.google.common.base.Optional.of(p));

        System.out.println("===========9============");
        Optional<Person> collect = persons.stream().collect(Collectors.maxBy(Comparator.comparing(x -> x.getAge())));
        System.out.println(collect.get());


//        Разбиение потока исполнителей на группы и солистов
//        public Map<Boolean, List<Artist>> bandsAndSolo(Stream<Artist> artists) {
//            return artists.collect(partitioningBy(artist -> artist.isSolo()));
//        }

//        Создание конкретной коллекции с помощью метода toCollection
//        stream.collect(toCollection(TreeSet::new));
//        TreeSet<Person> collect = persons.stream().collect(toCollection(TreeSet::new));
//        System.out.println(collect);

    }
}
