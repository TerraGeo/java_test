package test.professional.default_func_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerOne {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>() {{
            add("One");
            add("Two");
            add("Three");
        }};
        BiConsumer<String, List<String>> addPrefixAndPrint = (prefix, list) -> list.forEach(e -> System.out.println(prefix + e));
        addPrefixAndPrint.accept("pre-", strings);

    }
}
