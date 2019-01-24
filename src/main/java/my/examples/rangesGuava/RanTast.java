package my.examples.rangesGuava;

import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class RanTast {

    public static void main(String[] args) {

//        RangeSet<LocalDateTime> vpnSessionVpnRole = TreeRangeSet.create();
//        RangeSet<LocalDate> vpnSessionVpnRole2 = TreeRangeSet.create();
//
//        RangeSet<LocalDateTime> shortcutVpnSessions = TreeRangeSet.create();
//        Range<LocalDateTime> vpnSessins = Range.closed(LocalDateTime.parse("2014-10-01T18:00:00.000"),null);
//        shortcutVpnSessions.add(vpnSessins);
//        Range<LocalDateTime> range1 = shortcutVpnSessions.asRanges().stream().findFirst().get();
//
//        System.out.println(shortcutVpnSessions);
//
//        shortcutVpnSessions.remove(range1);
//
//        System.out.println(shortcutVpnSessions);
//
//
//        System.out.println("==================");



//        Range<LocalDateTime> cuttingRange1 = Range.closed(LocalDateTime.parse("2014-10-01T19:00:00.000"), LocalDateTime.parse("2014-10-01T20:00:00.000"));
//        shortcutVpnSessions.remove(cuttingRange1);
//        Range<LocalDateTime> cuttingRange2= Range.closed(LocalDateTime.parse("2014-10-01T20:10:00.000"), LocalDateTime.parse("2014-10-01T21:00:00.000"));
//        shortcutVpnSessions.remove(cuttingRange2);

//        shortcutVpnSessions.asRanges().stream()
//                .filter(range -> range.hasUpperBound() && range.hasLowerBound())
//                .map(range -> Range.closed(range.lowerEndpoint().toLocalDate(), range.upperEndpoint().toLocalDate()))
//                .forEach(vpnSessionVpnRole2::add);

//        System.out.println(vpnSessionVpnRole2);

//        ArrayList<Integer> integers = Lists.newArrayList(1, 4, 3, 2);
//        int i = integers.get(0).intValue();
//        System.out.println(i);
//        integers.sort(Comparator.comparing(Integer::intValue).reversed());
//        System.out.println(integers);


        RangeSet<LocalDate> rangeSet = TreeRangeSet.create();
        Range<LocalDate> closed1 = Range.closed(LocalDate.parse("2014-10-01"), LocalDate.parse("2014-10-10"));
        rangeSet.add(closed1);
        Range<LocalDate> closed = Range.closed(LocalDate.parse("2014-09-20"), LocalDate.parse("2014-10-03"));

        RangeSet<LocalDate> rangeSet1 = rangeSet.subRangeSet(closed);

        rangeSet.asRanges().forEach(range ->
                rangeSet.removeAll(rangeSet1));


        System.out.println(rangeSet);
    }

}
