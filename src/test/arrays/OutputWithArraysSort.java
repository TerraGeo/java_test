package test.arrays;

import java.util.Arrays;

public class OutputWithArraysSort {
    public static void main(String[] args) {
        int [][] ints = new int[2][];
        Arrays.sort(ints[1]);
        System.out.println(Arrays.toString(ints[1]));
    }
}
