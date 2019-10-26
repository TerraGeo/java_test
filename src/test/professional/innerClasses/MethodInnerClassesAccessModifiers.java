package test.professional.innerClasses;

public class MethodInnerClassesAccessModifiers {
    public static void main(String[] args) {
        class Inner {
            void printLine() {
                System.out.println();
            }

            private double add(double a, double b) {
                return a + b;
            }

            public int square(int a) {
                return a * a;
            }

            protected String toUpperCase(String s) {
                return s.toUpperCase();
            }
        }

        Inner inner = new Inner();

        System.out.println(inner.add(2., 4.2));
        inner.printLine();
        System.out.println(inner.square(53));
        System.out.println(inner.toUpperCase("djsa"));
        inner.printLine();

        new MethodInnerClassesAccessModifiers().commitInnerMethodClassCall();
    }

    private void commitInnerMethodClassCall() {
        class Inner {
            void printLine() {
                System.out.println();
            }

            private double add(double a, double b) {
                return a + b;
            }

            public int square(int a) {
                return a * a;
            }

            protected String toUpperCase(String s) {
                return s.toUpperCase();
            }
        }

        Inner inner = new Inner();

        System.out.println(inner.add(2., 4.2));
        inner.printLine();
        System.out.println(inner.square(53));
        System.out.println(inner.toUpperCase("djsa"));
    }
}
