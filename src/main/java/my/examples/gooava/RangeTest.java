package my.examples.gooava;


import com.google.common.collect.Range;
import org.joda.time.LocalDate;
import org.joda.time.YearMonth;

public class RangeTest {

    public static void main(String[] args) {
//        Range<LocalDate> r = Range.closed(LocalDate.parse("2000-01-20"),LocalDate.parse("2005-01-01"));
//        Range<LocalDate> r2 = Range.closed(LocalDate.parse("2001-01-01"),LocalDate.parse("2002-01-01"));
//        System.out.println(r.contains(LocalDate.parse(YearMonth.parse("2000-01-20").toString()).plusMonths(1).minusDays(1)));
//
//        System.out.println(LocalDate.parse(YearMonth.parse("2000-01-20").toString()).plusMonths(1).minusDays(1));
//
//        System.out.println(LocalDate.parse(YearMonth.parse("2000-01-01").toString()));
//        System.out.println();
//        System.out.println(LocalDate.parse(YearMonth.parse("2000-01-01").toString()).dayOfMonth().withMaximumValue());
//
//        YearMonth yearMonth = YearMonth.parse("2001-01-02");
//        System.out.println(yearMonth);


//        LocalDate date = LocalDate.parse("2000-01-01");
//        LocalDate date1 = LocalDate.parse("2000-01-01").plusDays(1);
//        boolean before = date.isBefore(date1);
//        System.out.println(before);


        Range<LocalDate> r1 = Range.closed(LocalDate.parse("2000-01-20"),LocalDate.parse("2005-01-01"));
        Range<LocalDate> r3 = Range.closed(LocalDate.parse("2005-01-01"),LocalDate.parse("2005-01-03"));
        boolean connected = r1.isConnected(r3);
        System.out.println("================");
        System.out.println("con " + connected);

    }

}
