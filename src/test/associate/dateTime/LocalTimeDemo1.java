package test.associate.dateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeDemo1 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(2, 2, 15);
        System.out.println(localTime.getLong(ChronoField.valueOf("MINUTE_OF_DAY")));
    }
}
