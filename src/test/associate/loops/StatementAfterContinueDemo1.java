package test.associate.loops;

public class StatementAfterContinueDemo1 {
    public static void main(String[] args) {
        String [] strings = {"A", "B", "C"};
        for (String s : strings) {
            continue;
            //System.out.println(s);
        }
    }
}
