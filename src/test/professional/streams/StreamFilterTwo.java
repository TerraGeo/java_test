package test.professional.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilterTwo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(19);
        numbers.add(82);
        numbers.add(9);
        numbers.add(10);
        numbers.add(5);

        Predicate<Integer> predicate = i -> i > 10;

        numbers.stream().filter(predicate).count();

        System.out.println(numbers);
    }
}
