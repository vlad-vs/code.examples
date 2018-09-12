package my.examples._assert;

import static com.google.common.base.Preconditions.checkArgument;

public class AssertMain {
    public static void main(String[] args) {
        String a = "1";
        boolean equals = a==null;
        System.out.println(equals);
        assert equals;
        System.out.println("ok");

        checkArgument(a != null, "retId = null, can not continue create RetailerPos value!");
    }
}
