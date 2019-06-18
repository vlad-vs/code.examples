package my.examples.arguments;

public class Dog extends Anymal{

    String name = "dog";

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
        return "Dog{" +
                "name='" + name + '\'' +
                ", valueType='" + type + '\'' +
                '}';
    }
}
