package my.examples.reflection;

import java.util.Objects;

public class MyClass {

    private int id;
    private String name;


    private int calc(int a, int b){
        return a + b;
    }

    public MyClass() {
    }

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return id == myClass.id &&
                Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
