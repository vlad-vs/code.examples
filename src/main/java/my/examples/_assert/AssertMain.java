package my.examples._assert;

import static com.google.common.base.Preconditions.checkArgument;

public class AssertMain {
    public static void main(String[] args) {
        String a = null;
//        boolean equals = a == null;
//        System.out.println(equals);
//        assert (equals) : "Ошибка";
//        System.out.println("ok");
//
//        checkArgument(a != null, "retId = null, can not continue create RetailerPos value!");


//        Integer calc = CalcAssert.calc(-1, 5);
//        System.out.println(calc);
        String s1 = "Hello".substring(1, "Hello".length());
        System.out.println(s1);
        String s2 = "Hello".substring(0, 1);
        System.out.println(s2);
        System.out.println(s1+s2);



        System.out.println(reverse("Hello"));


    }
    static int sum(int a, int b) {
        assert (a != b) : "Value of " + a + " + " + b + " is too large to add.";
        final int result = a + b;
        assert (result - a == b) : "Sum of " + a + " + " + b + " returned wrong sum " + result;
        return result;
    }


    static String reverse(String arg) {
        if(arg.length()== 0) {
            return arg;
        }
        else {
            return reverse(arg.substring(1, arg.length())) + arg.substring(0, 1);
        }
    }


}
