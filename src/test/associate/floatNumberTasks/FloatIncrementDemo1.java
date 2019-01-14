package test.associate.floatNumberTasks;

public class FloatIncrementDemo1 {
    public static void main(String[] args) {
        float f = 12.1f;
        double d = f++;
        long l = 12;
        System.out.println(d);
        d--;
        System.out.println(d);
        d -= 0.3;
        System.out.println(f + " " + d + " " + l);
        System.out.println((f == d) + " ");
        System.out.println(d == l);
    }
}
