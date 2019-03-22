package my.examples.myOrm.dto;

import my.examples.myOrm.annotations.Column;
import my.examples.myOrm.annotations.Table;
import my.examples.myOrm.pojo.ColumnType;

import java.util.Objects;

@Table()
public class Person {

    @Column(name = "name",type = ColumnType.text)
    private String name;

    @Column(name = "age",type = ColumnType.integer)
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
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
}
