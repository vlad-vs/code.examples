package my.examples.shablons;

public class TestSingl {
    private static TestSingl ourInstance = new TestSingl();

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static TestSingl getInstance() {
        return ourInstance;
    }

    private TestSingl() {
    }

    @Override
    public String toString() {
        return "TestSingl{" +
                "name='" + name + '\'' +
                '}';
    }
}
