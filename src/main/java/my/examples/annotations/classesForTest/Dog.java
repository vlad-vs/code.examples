package my.examples.annotations.classesForTest;

public class Dog extends AbstrAnimal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void say() {
        System.out.println("Dog say");
    }

    @Override
    public void run() {
        System.out.println("Dog run");
    }

}
