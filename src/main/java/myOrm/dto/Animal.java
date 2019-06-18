package myOrm.dto;

import myOrm.annotations.Column;
import myOrm.annotations.Table;
import myOrm.pojo.ColumnType;
import myOrm.pojo.ColumnValueType;

import java.util.Objects;

@Table(name = "animal")
public class Animal {

    @Column(name = "name", valueType = ColumnValueType.text, typeOne = ColumnType.nullType)
    private String name;

    @Column(name = "age", valueType = ColumnValueType.integer, typeOne = ColumnType.nullType)
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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
        Animal person = (Animal) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
