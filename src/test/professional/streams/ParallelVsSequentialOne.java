package test.professional.streams;

import java.util.Arrays;

public class ParallelVsSequentialOne {
    public static void main(String[] args) {
        System.out.println("Using sequential stream: ");
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}).forEach(i -> System.out.println(i + " " + Thread.currentThread().getName()));

        System.out.println("Using parallel stream: ");
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}).parallel().forEach(i -> System.out.println(i + " " + Thread.currentThread().getName()));
    }
}
