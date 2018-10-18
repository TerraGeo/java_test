package test.dateTime;

import java.time.LocalDate;

public class CurrentDateDemo1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 2, 21).now();
        localDate.plusYears(2);
        System.out.println(localDate);
    }
}
