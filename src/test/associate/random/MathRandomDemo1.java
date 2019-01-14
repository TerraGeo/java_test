package test.associate.random;

import java.util.Arrays;

public class MathRandomDemo1 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for(int i = 0; i < 10; i++) {
            randomArray[i] = (int)(Math.random() * 6) + 1;
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
