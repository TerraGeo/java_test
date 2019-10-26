package test.professional.date;

import java.time.LocalDate;
import java.time.Year;

public class AdjustIntoOne {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 5, 2);
        Year year = Year.of(2014);
        System.out.println(date.adjustInto(year.atDay(1)));
        System.out.println(year);
    }
}
