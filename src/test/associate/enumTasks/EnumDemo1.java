package test.associate.enumTasks;

public class EnumDemo1 {

    public static void main(String[] args) {
        System.out.println(Speed.FAST == Speed.FASTER);
    }
}

enum Speed {
    FAST(2), FASTER(3), SLOW(1);

    private final int speed;

    /*public*/ Speed(final int speed) {
        this.speed = speed;
    }
}
