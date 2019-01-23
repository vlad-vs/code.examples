package my.examples;

import lombok.val;
import org.joda.time.LocalDate;

public class EnMain {

    public static void main(String[] args) {
        GeoZoneSourceType byId = GeoZoneSourceType.getById((byte) 1);
        boolean equals = GeoZoneSourceType.RP.equals(byId);
        System.out.println(equals);


        LocalDate localDate = new LocalDate(5000, 1, 1);
        LocalDate parse = LocalDate.parse("5000-01-01");

        System.out.println(parse.equals(localDate));


    }

}
