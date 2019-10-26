package test.professional.date;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Year;

public class CurrentDateOne {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 3, 9);
        Year year = Year.of(2011);
        //LocalDate date1 = year.now();
        System.out.println(year.now());
    }
}
