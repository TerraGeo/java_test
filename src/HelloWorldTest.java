import static test.associate.staticTasks.StaticTest.m;

public class HelloWorldTest {
    static int x = 2;
    static {
        int x = 3;
    }

    public static void main(String[] args) {
        System.out.println("Hey, there!");
        String strp[][] = new String[1][];
        int[][] ints = new int[3][2];
        ints[0] = new int[3];
        if (x > 1) {
            int x = 4;
        }
        m();
        Number n = new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        };


        System.out.println(x);
        for(int i : new int[3]) {
            System.out.println(i);
        }
    }

    public void method() throws Exception{}
}
