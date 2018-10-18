package test.staticTasks;

public class InstanceVariableInStaticContextDemo1 {
    int _ = $;
    static int $ = 5;

    public static void main(String[] args) {
        //System.out.println($ + _);
        System.out.println($ + new InstanceVariableInStaticContextDemo1()._);
    }
}
