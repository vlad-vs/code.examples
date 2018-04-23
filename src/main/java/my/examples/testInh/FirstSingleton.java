package my.examples.testInh;

public class FirstSingleton {
    private static FirstSingleton ourInstance = new FirstSingleton();

    public static FirstSingleton getInstance() {
        return ourInstance;
    }

    private FirstSingleton() {
    }
}
