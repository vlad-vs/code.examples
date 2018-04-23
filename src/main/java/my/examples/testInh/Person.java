package my.examples.testInh;

public class Person extends People implements PersonInt {

    String type = "MEN";


    @Override
    public int getHand() {
        return super.getHand();
    }

    @Override
    public int getLeg() {
        return super.getLeg();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void sayHello() {
        System.out.println("Hello my name " + super.getName());
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "hand=" + super.getHand() +
                ", leg=" + super.getLeg() +
                ", name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
