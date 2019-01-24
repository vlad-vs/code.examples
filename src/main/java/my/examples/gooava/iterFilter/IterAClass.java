package my.examples.gooava.iterFilter;

public class IterAClass implements IterInter {

    private String name;



    public IterAClass(String name) {
        this.name = name;
    }

    public String get(){
        return name;
    }

    @Override
    public String toString() {
        return "IterAClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
