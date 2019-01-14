package test.associate.staticTasks;

public class InvalidStaticVarDeclarationDemo3 {

    static {
        //x = 10;
        y = 5;
    }

    int x;
    final static int y;

    public static void main(String[] args) {
        try {
            InvalidStaticVarDeclarationDemo3 demo = new InvalidStaticVarDeclarationDemo3();
            int c = demo.x / y;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetical Exception.");
        }
    }
}
