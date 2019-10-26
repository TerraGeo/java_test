package test.professional.innerClasses;

public class EffectivelyFinalVariableOne {
    public static void main(String[] args) {
        method(3, 5);
        method(4, 2);
    }

    public static void method(int a, int b) {
        class Test {
            public void in() {
                //System.out.println(a);
                System.out.println(b);
            }
        }
        a += 2;
        new Test().in();
    }

    public void methodTwo(int a, int b) {
        class Test {
            public void in() {
                //System.out.println(a);
                System.out.println(b);
            }
        }
        a += 2;
        new Test().in();
    }
}
