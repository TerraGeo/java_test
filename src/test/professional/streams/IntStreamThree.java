package test.professional.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;

public class IntStreamThree {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 4, 6, 6);
        //System.out.println(integers.stream().filter(e -> e%2 ==0).sum());
        System.out.println(integers.stream().filter(e -> e%2 == 0).mapToInt(e -> e).sum());
    }
}
