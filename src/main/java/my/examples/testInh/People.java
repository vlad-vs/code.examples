package my.examples.testInh;

public abstract class People {

    private int hand = 2;

    private int leg = 2;

    private String name;

    private int age;

    public int getHand() {
        return hand;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "hand=" + hand +
                ", leg=" + leg +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
