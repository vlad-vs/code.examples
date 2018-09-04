package my.examples.arguments;

public class tastArg {

    private static void allAnimals(Anymal... args){
        for (Anymal arg : args) {
            System.out.println(arg);
        }
    }

    public static void main(String... args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        allAnimals(cat,dog);
    }
}
