package test.professional.streams;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        IntStream.rangeClosed(0, 9).forEach(list::add);
        System.out.println(list);
    }
}
