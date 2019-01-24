package my.examples.time.deltaTime;

import org.joda.time.*;

public class MainTestDelta {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime past = LocalDateTime.now().minusHours(2).minusSeconds(1);

//        int hourOfDay0 = now.getMinuteOfHour();
//        int hourOfDay1 = now.getHourOfDay();
//        System.out.println(hourOfDay0);
//        System.out.println(hourOfDay1);

        LocalDateTime diff;

//        Days
        Hours hours = Hours.hoursBetween(now, past);
        System.out.println(hours);

        Seconds seconds = Seconds.secondsBetween(now, past);
        System.out.println(seconds);
        Minutes minutes = seconds.toStandardMinutes();
        System.out.println(minutes);



    }
}
