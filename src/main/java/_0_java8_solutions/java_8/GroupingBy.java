package _0_java8_solutions.java_8;

import com.google.inject.internal.util.Lists;
import _0_java8_solutions.java_8.suplier.Person;

import java.util.ArrayList;

import static java.util.stream.Collectors.groupingBy;

public class GroupingBy {

    public static void main(String[] args) {
        Person p1 = new Person("Tom",20);
        Person p2 = new Person("Jane",25);
        Person p3 = new Person("Andy",27);
        Person p4 = new Person("Sara",21);

        ArrayList<Person> people = Lists.newArrayList(p1, p2, p3, p4);
        System.out.println(people);
        people.sort(Person::compareTo);
        System.out.println(people);


    }
}
