package test.associate.dateTime;

import java.time.Duration;
import java.time.LocalDate;

public class InvalidPlusInvocationDemo1 {
    public static void main(String[] args) {
        Duration due = Duration.ofDays(-3);
        LocalDate ld = LocalDate.of(2016, 1, 1);
        //System.out.println(ld.plus(due.toDays()));
    }
}
