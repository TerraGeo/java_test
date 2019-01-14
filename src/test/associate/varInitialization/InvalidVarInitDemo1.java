package test.associate.varInitialization;

public class InvalidVarInitDemo1 {
    int i = 10;

    public static void main(String[] args) {
        int i;

        /*if (new InvalidVarInitDemo1().go(i)) i = 5;
        System.out.println(i);*/
    }

    public boolean go(int x) {
        return x > 5;
    }
}
