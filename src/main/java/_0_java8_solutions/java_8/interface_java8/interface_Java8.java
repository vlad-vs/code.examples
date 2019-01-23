package _0_java8_solutions.java_8.interface_java8;

public class interface_Java8 {

    public static void main(String[] args) {
        CalrulateTestInterface f = new CalrulateTestInterface() {

            @Override
            public int calculate(int a) {
                return a+a;
            }
        };
        System.out.println(f.calculate(3));
        System.out.println(f.dubleS(2));
    }

}
