package test.professional.innerClasses;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InnerClassMethodCall1 {

    static int i = 10;

    public class Inner {
        public /*static*/ void print() {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Inner inner = new InnerClassMethodCall1().new Inner();
        inner.print();
        System.out.println(ZonedDateTime.of(LocalDateTime.of(2019, 1, 26, 15, 38, 8), ZoneId.of("Africa/Cairo")).toInstant().toEpochMilli());
    }
}
