package test.professional.interfacesPro;

public class AbstractClassVarargsMethodLambdaOne {
    abstract class Test {
        public abstract void print(String... x);

        public void print(String s) {
            System.out.println("print");
        }
    }

    interface TestInterface {
        public abstract void print(String... x);

        default void print(String s) {
            System.out.println("print");
        }
    }

    static class InnerDemo {
        public static void main(String[] args) {
            /*Test test = (String... x) -> System.out.println(x[1]);
            test.print("java test");*/

            TestInterface test = varargString -> System.out.println(varargString[1]);
            test.print("java test");
            test.print("de", "re", "32");
        }
    }
}
