package test.professional.innerClasses;

public class InnerClassAccessGlobalVariable {
    static int y = 1;

    public static void main(String[] args) {
        abstract class Cal {
            public abstract int calc(int x);
        }

        Cal cal = new Cal() {
            @Override
            public int calc(int x) {
                return x - y;
            }
        };
        System.out.println(cal.calc(2));
    }
}
