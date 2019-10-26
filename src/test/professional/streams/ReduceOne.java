package test.professional.streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceOne {
    public static void main(String[] args) {
        IntStream ints = IntStream.of(11, 2, 7, 32, 4, 8, 21, 9);
        IntStream intsTwo = IntStream.of(11, 2, 7, 32, 4, 8, 21, 9);
        //int out = ints.filter(in -> in % 2 == 0).reduce(Integer::sum);
        OptionalInt optionalInt = ints.filter(in -> in % 2 == 0).reduce(Integer::sum);
        int out = intsTwo.filter(in -> in % 2 == 0).reduce(0, Integer::sum);

        System.out.println(out);
        System.out.println(optionalInt.getAsInt());
    }
}
