package _0_java8_solutions.java_8.suplier;

import com.google.common.collect.ComparisonChain;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person>, Comparator<Person> {

    private  String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }



    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        return ComparisonChain.start()
                .compare(age, o.getAge())
                .compare(name, o.getName())
                .result();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
