package test.exceptions;

public class DoubleFinally {
    public static void main(String[] args) {
        try {
            throw new ClassCastException();
        } catch (ClassCastException e) {
            System.out.println("A");
        } finally {
            System.out.println("B");
        } /*finally{
            System.out.println("B 2");
        }*/
    }
}
