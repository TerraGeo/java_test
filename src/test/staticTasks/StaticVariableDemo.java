package test.staticTasks;

public class StaticVariableDemo {
    static int i;
    int j;

    StaticVariableDemo() {
        j = i++;
    }

    public static void main(String[] args) {
        StaticVariableDemo s1 = new StaticVariableDemo();
        StaticVariableDemo s2 = new StaticVariableDemo();
        StaticVariableDemo s3 = new StaticVariableDemo();
        System.out.println(s1.i);
        System.out.println(s1.j);
        System.out.println(s3.j);
    }
}
