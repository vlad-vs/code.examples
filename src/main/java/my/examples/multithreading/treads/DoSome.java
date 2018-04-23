package my.examples.multithreading.treads;

public class DoSome implements Runnable {

String name;

    public DoSome(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i<10;i++) System.out.println(name + " = " + i);
    }

}
