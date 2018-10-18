package test.generics;

public class HowDoesItWorkDemo1 {
    public static void main(String[] args) {
        Integer integer = new HowDoesItWorkDemo1().getCharSequence();
        String integer2 = new HowDoesItWorkDemo1().getString();
        Object integer3 = new HowDoesItWorkDemo1().getString();
    }

    public <X extends CharSequence> X getCharSequence() {
        return (X) "123";
    }

    public <X extends String> X getString() {
        return (X) "hello";
    }
}
