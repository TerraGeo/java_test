package test.professional.collectionsPro;

import java.util.Arrays;

public class ArraysParallelOne {
    public static void main(String[] args) {
        long[] arrays = {4, 8, 12};
        Arrays.parallelPrefix(arrays, Long::sum);
        System.out.println(Arrays.toString(arrays));
    }
}
