package test.professional.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PecsDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<Long> longs = new ArrayList<>();

        Comparator<Number> comparator = (a, b) -> 0;

        sort(integers, comparator);
        sort(doubles, comparator);
        sort(longs, comparator);

    }

    public static void sort(List<? extends Number> integers, Comparator<? super Number> comparator){}
}
