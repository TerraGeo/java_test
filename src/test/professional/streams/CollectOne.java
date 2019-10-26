package test.professional.streams;

import java.util.stream.Stream;

public class CollectOne {
    public static void main(String[] args) {
        Stream<String> ins = Stream.of("1", "2", "3", "2", "1").distinct();
        String result = ins.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        System.out.println(result);
    }
}
