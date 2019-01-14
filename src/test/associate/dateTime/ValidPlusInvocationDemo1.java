package test.associate.dateTime;

import java.time.LocalDate;

public class ValidPlusInvocationDemo1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2016, 1, 31).plusMonths(1);
        System.out.println(localDate);
    }
}
