package my.examples.hash;

import java.util.Objects;

public class HeshTest {

    private String name;

    private int age;

    public HeshTest(String name, int age) {
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
        HeshTest heshTest = (HeshTest) o;
        return age == heshTest.age &&
                Objects.equals(name, heshTest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "HeshTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

