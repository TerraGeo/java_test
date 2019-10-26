package test.professional.enums;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class EnumInASetOne {
    public static void main(String[] args) {
        System.out.println(new HashSet<>(Arrays.asList(Example.values())));
        System.out.println(new TreeSet<>(Arrays.asList(Example.values())));
        System.out.println(new LinkedHashSet<>(Arrays.asList(Example.values())));
    }
}

enum Example {
    A, N, B, U, C;
}
