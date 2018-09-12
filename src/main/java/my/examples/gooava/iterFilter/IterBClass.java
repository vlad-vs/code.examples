package my.examples.gooava.iterFilter;

public class IterBClass implements IterInter {

    String name;

    public IterBClass(String name) {
        this.name = name;
    }

    public String get(){
        return name;
    }

    @Override
    public String toString() {
        return "IterBClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
