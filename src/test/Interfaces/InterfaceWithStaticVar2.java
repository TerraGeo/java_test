package test.Interfaces;

public interface InterfaceWithStaticVar2 {
    static int speed = 12;
    String s = "speed";
}

class Demo {
    public static void main(String[] args) {
        System.out.println(InterfaceWithStaticVar2.s);
        System.out.println(InterfaceWithStaticVar2.speed);
    }
}
