package test.professional.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AvaragingIntOne {
    public static void main(String[] args) {
        Stream<String> strings = (Stream<String>)Stream.of("12", "13", "3", "1");
        //int avg = strings.collect(Collectors.averagingInt(s -> Integer.parseInt(s.toString())));
        double avg = strings.collect(Collectors.averagingInt(Integer::parseInt));

        System.out.println(avg);
    }
}
