package test.associate.dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToMillisParser {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd yyyy HH:MM");
        Date date = simpleDateFormat.parse("DEC 08 1993 14:13");

        //System.out.println(date.getTime());
        LocalDateTime localDateTime = LocalDateTime.parse("1993-12-13T14:13");
        System.out.println(localDateTime);
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Paris")).toInstant().toEpochMilli());
        System.out.println(new Date(1532866636775L));
    }
}
