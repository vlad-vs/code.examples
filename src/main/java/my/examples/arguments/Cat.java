package my.examples.arguments;

public class Cat extends Anymal{

    String name = "cat";

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", valueType='" + type + '\'' +
                '}';
    }
}
