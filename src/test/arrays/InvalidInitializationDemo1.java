package test.arrays;

import java.util.Arrays;

public class InvalidInitializationDemo1 {
    public static void main(String[] args) {
        //char[] array1 = new char {'2', 'g', 'n'};
        //int[] array2 = new int[2] {1, 2, 3};
        //int[] array3 = int[] {1, 2, 3};
        int[] array4 = new int[4];
        //array4 = {1, 2, 3, 4};
        int min = Integer.MIN_VALUE;
        array4[2] = 1;
        array4[1] = --min;
        System.out.println(Arrays.toString(array4));
    }
}
