package test.professional.default_func_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionComposeOne {
    public static void main(String[] args) {
        Function<Integer, String> toString = Object::toString;
        Function<String, String> augmentWithHyphen = s -> "-" + s + "-";
        Function<String, Integer> toIntegerPlusThree = s -> Integer.valueOf(s) + 3;
        Function<String, Double> toDoublePlusThree = s -> Double.valueOf(s) + 3;
        Function<String, List<String>> addStringToList = s -> new ArrayList<String>() {{add(s);}};

        System.out.println(augmentWithHyphen.compose(toString).apply(285));
        System.out.println(toIntegerPlusThree.compose(toString).apply(285));
        System.out.println(toDoublePlusThree.compose(toString).apply(234));
        System.out.println(addStringToList.apply("dark").get(0));

        Function<Integer, Double> toStringDoublePlusThree = toDoublePlusThree.compose(toString);
        Function<Integer, Integer> toStringIntegerPlusThree = toIntegerPlusThree.compose(toString);
        Function<Integer, List<String>> toStringAddStringToList = addStringToList.compose(toString);
    }
}
