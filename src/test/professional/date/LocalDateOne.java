package test.professional.date;

import java.time.LocalDate;

public class LocalDateOne {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2011, 1, 31).plusDays(1);
        //LocalDate localDate = LocalDate.of(2011, 1, 31).plusDay(1);
        System.out.println(localDate);
    }
}
