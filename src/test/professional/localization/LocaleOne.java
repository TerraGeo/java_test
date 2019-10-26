package test.professional.localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleOne {
    public static void main(String[] args) {
        Locale locale = new Locale("de", "fr");
        ResourceBundle rb = ResourceBundle.getBundle("SRBundle", locale);
        System.out.println(rb.getString("Table"));
    }
}
