package test.staticTasks;

public class StaticVarDemo3 {
    static boolean b = false;

    public static void main(String[] args) {
        String str;

        if (b = true) {str = "True";}

        //str = b ? str : "false";

        //System.out.println(str);
    }
}
