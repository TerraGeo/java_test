package test.professional.comparators;

import java.util.Comparator;

public class IntegerComparatorThree {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Comparator.comparing(e -> e.intValue());
        System.out.println(comparator.compare(2, 4));
    }
}
