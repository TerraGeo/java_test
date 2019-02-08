package test.professional.streams;

import java.util.HashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStream2 {
    public static void main(String[] args) {
        IntStream ds = IntStream.of(1, 2, 2, 4);
        //Stream ste = ds.boxed().map(Integer::toString);
        System.out.println(ds.boxed().distinct().findFirst());
    }
}
