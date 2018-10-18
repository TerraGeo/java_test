package test.staticTasks;

public class StaticVariableDemo2 {
    static int x = 1;

    StaticVariableDemo2() {
        x++;
    }

    public static void main(String[] args) {
        System.out.println(x + check(2));
        System.out.println(x);
    }

    static int check(int i) {
        return new StaticVariableDemo2().x*i;
    }
}
