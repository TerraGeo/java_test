package test.professional.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class GroupingByConcurrentOne {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        //HashMap<Integer, List<Integer>> map = ints.parallelStream().collect(Collectors.groupingByConcurrent(i -> i%2 == 0 ? 0 : 1));
        ;
        System.out.println(ints.parallelStream().collect(Collectors.groupingByConcurrent(i -> i%2 == 0 ? 0 : 1)).getClass());
    }
}
