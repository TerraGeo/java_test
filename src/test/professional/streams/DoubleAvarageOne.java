package test.professional.streams;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class DoubleAvarageOne {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        //double avg = stream.skip(2).mapToInt(i -> i.intValue()).average();
        double avg = stream.skip(2).mapToInt(i -> i.intValue()).average().getAsDouble();
        OptionalDouble optAvg = stream.skip(2).mapToInt(i -> i.intValue()).average();
        System.out.println(avg);
    }
}
