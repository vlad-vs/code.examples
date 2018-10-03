package _0_java8_solutions.java_8.userInterface;

public class UaserMain {

    public static void main(String[] args) {

       UserBuilder userBuilder =  UserUseInter::new;
        UserUseInter tom = userBuilder.create("tom");
        System.out.println(tom);

    }
}
