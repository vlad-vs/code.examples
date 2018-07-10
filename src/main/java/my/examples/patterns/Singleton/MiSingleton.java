package my.examples.patterns.Singleton;

public class MiSingleton {

    //Обязательно приватное поле
    private static MiSingleton ourInstance = new MiSingleton();

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static MiSingleton getInstance() {
        return ourInstance;
    }

    //Обязательно приватный конструктор
    private MiSingleton() {

    }

    @Override
    public String toString() {
        return "MiSingleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
