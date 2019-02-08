package test.professional.anonymousClasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class AnonymousClassDeclarationInMethod {

    static int y = 0;

    public static void main(String[] args) {
        abstract class A {
            public abstract int calc(int x);
        }

        A a = new A() {
            public int calc(final int x) {
                    return x * y;
            }
            public void print(int x) {
                System.out.println(calc(x));
            }
        };

        System.out.println(a.calc(2));
        System.out.println(ZonedDateTime.now().toInstant().toEpochMilli());
        //((A) a).print(2);                 illegal method call
    }
}
