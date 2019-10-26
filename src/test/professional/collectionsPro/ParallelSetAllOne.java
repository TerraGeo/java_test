package test.professional.collectionsPro;

import java.util.Arrays;

public class ParallelSetAllOne {
    public static void main(String[] args) {
        String[] list = {"1", "2", "3"};

        Arrays.parallelSetAll(list, x -> Integer.toString(x) + list[x]);
        System.out.println(list[0]);
    }
}
