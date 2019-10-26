package test.professional.streams;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinByMaxByOne {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("A", "ad", "oids432m3", "982n23n,mcxvl");
        Stream<String> streamTwo = Stream.of("A", "ad", "oids432m3", "982n23n,mcxvl");
        Stream<String> streamThree = Stream.of("A", "ad", "oids432m3", "982n23n,mcxvl");
        Stream<String> streamFour = Stream.of("A", "ad", "oids432m3", "982n23n,mcxvl");
        Optional<String> minStringTwo = streamTwo.min(Comparator.comparing(String::length));
        Optional<String> minString = stream.collect(Collectors.minBy(Comparator.comparing(String::length)));
        Optional<String> maxString = streamThree.collect(Collectors.maxBy(Comparator.comparing(String::length)));
        Optional<String> maxStringTwo = streamFour.max(Comparator.comparing(String::length));

        System.out.println(minString);
        System.out.println(minStringTwo);
        System.out.println(maxString);
        System.out.println(maxStringTwo);
    }
}
