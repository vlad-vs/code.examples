package my.examples.reflection;

public class MyClass {

    private int id;
    private String name;


    private int calc(int a, int b){
        return a + b;
    }

    public MyClass() {
    }

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
