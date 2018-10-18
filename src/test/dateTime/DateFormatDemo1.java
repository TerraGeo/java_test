package test.dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatDemo1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 12, 25);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMM uuuu");
        System.out.println(localDate.format(format));
    }
}
