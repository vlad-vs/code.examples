package my.examples.patterns.Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        MiSingleton m1 = MiSingleton.getInstance();
        m1.setName("vlad");
        MiSingleton m2 = MiSingleton.getInstance();

        System.out.println(m1);
        System.out.println(m2);
    }
}
