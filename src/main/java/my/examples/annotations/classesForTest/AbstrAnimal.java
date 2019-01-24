package my.examples.annotations.classesForTest;

public abstract class AbstrAnimal implements Animal {


    String name;
    int age;

    public AbstrAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AbstrAnimal() {
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
    public String toString() {
        return "AbstrAnimal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
