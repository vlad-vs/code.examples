package my.examples.dataTime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class DateTineTest_1 {

    public static void main(String[] args) {

        DateTime parse = DateTime.parse("2014-11-04T17:41:52.000+01:00");


        LocalDate localDate = LocalDate.now();
        DateTime parse1 = DateTime.parse(localDate.toString());
        System.out.println("1 " + parse1);


        System.out.println(parse);

    }
}
