package test.associate.dateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class ChronoFieldDemo1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 12, 12);
        localDate = localDate.with(ChronoField.DAY_OF_YEAR, 30);
        System.out.println(localDate);
    }
}
