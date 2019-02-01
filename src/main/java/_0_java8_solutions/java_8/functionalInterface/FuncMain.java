package _0_java8_solutions.java_8.functionalInterface;

public class FuncMain {

    public static void main(String[] args) {

        GetSum summFunc = (i,y) -> {
            return i + y;
        };

        final int summ = summFunc.summ(2, 3);
        System.out.println(summ);
    }

}
