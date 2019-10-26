package test.professional.date;

import java.time.LocalDate;

public class LocalDateMonthValueOne {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2013, 2, 15);
        System.out.println(localDate.getMonthValue() + ":" + localDate.getDayOfWeek());
    }
}
