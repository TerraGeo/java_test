package test.associate.arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[] ints = {3, 6, 1, 4, 0};
        Arrays.sort(ints, 0, 4);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
