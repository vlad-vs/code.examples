package my.examples.strutegy.str_1;

public class Wrapper {

    private String name;

    public Wrapper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "name='" + name + '\'' +
                '}';
    }
}
