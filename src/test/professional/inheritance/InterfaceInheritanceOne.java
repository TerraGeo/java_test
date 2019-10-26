package test.professional.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.function.DoubleUnaryOperator;

public class InterfaceInheritanceOne {
    public static void main(String[] args) {
        System.out.println(new InterfaceTwo() {
            @Override
            public Number getNumber() {
                return 2.4;
            }
        }.getNumber());
        System.out.println(InterfaceTwo.methodWithException(3));
    }
}

interface InterfaceOne {
    static void printLine() {
        System.out.println("Inside Static One");
    }

    default void print() {
        System.out.println("Inside default one.");
    }

    default String methodWithException() throws IOException {
        return "Default method with exception. One";
    }

    Number getNumber();
}

interface InterfaceTwo extends InterfaceOne{
    static void printLine() {
        System.out.println("Inside Static two");
    }

    default void print() {
        System.out.println("Inside default two.");
    }

    default String methodWithException() throws FileNotFoundException {
        return "Default method with exception.Two";
    }

    static String methodWithException(int i) {
        return Integer.toString(i);
    }

    Number getNumber();
}
