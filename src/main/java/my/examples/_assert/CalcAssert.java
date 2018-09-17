package my.examples._assert;

public class CalcAssert {

    static Integer calc(Integer a, Integer b) {
        assert(a >= 0);
        assert (b == null) : " B = null!!!";
        if (a == null || b == null) {
            return 0;
        }
        return a + b;
    }

}
