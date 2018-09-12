package my.examples.java_8.UserInterface;

public class UaserMain {

    public static void main(String[] args) {

       UserBuilder userBuilder =  UserUseInter::new;
        UserUseInter tom = userBuilder.create("tom");
        System.out.println(tom);

    }
}
