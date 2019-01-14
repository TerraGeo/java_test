package test.associate.autoNunboxing;

public class InvalidPrimitiveAutoboxingDemo1 {
    public static void main(String[] args) {
        //System.out.println(new InvalidPrimitiveAutoboxingDemo1().check( 10));
    }

    boolean check(short x) {
        return x < 10;
    }
}
