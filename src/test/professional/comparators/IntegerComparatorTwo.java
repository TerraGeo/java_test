package test.professional.comparators;

import java.io.Serializable;
import java.util.Comparator;

public class IntegerComparatorTwo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;
    }
}
