package test.arrays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

public class ArraysFiller {
    public static void main(String[] args) throws ParseException {
        //args = {1, 2, 3};
        int[] ints = new int[3];
        Arrays.fill(ints, 1);
        System.out.println(ints[2]);
        System.out.println(LocalDateTime.parse("2018-09-27T11:00").atZone(ZoneId.of("Africa/Cairo")).toInstant().toEpochMilli());
    }
}
