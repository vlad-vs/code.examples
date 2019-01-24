package _0_java8_solutions.java_8.userInterface;

public class UserUseInter {

    private String name;

    public UserUseInter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserUseInter{" +
                "name='" + name + '\'' +
                '}';
    }
}
