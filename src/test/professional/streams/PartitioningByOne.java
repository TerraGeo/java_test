package test.professional.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningByOne {
    public static void main(String[] args) {
        //Stream stream = Stream.of("ABC", "abC", "aBdfgf", "AbCDS", "ab", "acdsiougo");
        Stream<String> stream = Stream.of("ABC", "abC", "aBdfgf", "AbCDS", "ab", "acdsiougo");
        Map<Boolean, List<String>> map = stream.collect(Collectors.partitioningBy((String s) -> s.startsWith("ab")));
        System.out.println(map);
    }
}
