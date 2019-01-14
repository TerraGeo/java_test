package test.associate.loops;

public class WhileLoopDemo1 {
    public static void main(String[] args) {
        int y = 0;
        long timeBeforeLoop = System.currentTimeMillis();
        while (y-- < 10) {continue;}
        long timeAfterLoop = System.currentTimeMillis();
        System.out.println(timeAfterLoop - timeBeforeLoop);
        String message = y > 10 ? "Greater than" : "Less than";
        System.out.println(message + " 10");
    }
}
