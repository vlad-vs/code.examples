package my.examples.multithreading.treads;

public class Main {

    public static void main(String[] args) {
        DoSome some1 = new DoSome("First");
        DoSome some2 = new DoSome("Second");

        Thread thread1 = new Thread(some1);
        Thread thread2 = new Thread(some2);

        Thread thread3 = new Thread(() -> {

        });

        thread1.start();
        thread2.start();

        System.out.println("end");
    }

}
