package my.examples.dataTime;

import org.joda.time.DateTime;

public class DateTineTest_1 {

    public static void main(String[] args) {

        DateTime parse = DateTime.parse("2014-11-04T17:41:52.000+01:00");

        System.out.println(parse);

    }
}
