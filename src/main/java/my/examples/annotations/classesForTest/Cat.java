package my.examples.annotations.classesForTest;

public class Cat extends AbstrAnimal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    private void screem(){
        System.out.println("cat scream");
    }

    @Override
    public void say() {
        System.out.println("cat say");
    }

    @Override
    public void run() {
        System.out.println("cat run");
    }
}
