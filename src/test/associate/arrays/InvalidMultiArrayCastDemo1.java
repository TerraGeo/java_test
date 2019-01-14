package test.associate.arrays;

import java.util.Arrays;

public class InvalidMultiArrayCastDemo1 {
    static int [] array;
    public static void main(String[] args) {
        long [][] l2d;
        long [] l1d = new long[] {1, 2, 3};
        Object o = l1d;
        l2d = new long[3][3];
        //l2d[0][0] = (long[]) o;
        l2d[0] = (long[]) o;
        System.out.println(Arrays.deepToString(l2d));

        System.out.println(Arrays.toString(array));
        array = new int[]{1, 2};
        System.out.println(Arrays.toString(array));
        int size = -1;
        array = new int[++size];
        System.out.println(Arrays.toString(array));
    }
}
