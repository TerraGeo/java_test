package test.professional.asserts;

import org.jetbrains.annotations.Contract;

public class AssertionOne {
    public static void main(String[] args) throws Exception {
        assert args == null : "No";

        System.out.println("Good");
        System.out.println(args == null);

    }
}
