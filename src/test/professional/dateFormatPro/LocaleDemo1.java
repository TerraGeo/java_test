package test.professional.dateFormatPro;

import java.text.DateFormat;
import java.util.Locale;

public class LocaleDemo1 {
    public static void main(String[] args) {
        System.out.println(DateFormat.getDateInstance(DateFormat.LONG, new Locale("fr")));
    }
}
