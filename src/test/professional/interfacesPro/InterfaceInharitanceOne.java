package test.professional.interfacesPro;

public class InterfaceInharitanceOne {
    public static void main(String[] args) {
        I1.staticPrint();
        I2.staticPrint();

        new I1() {
            @Override
            public void instancePrint() {
                System.out.println(1);
            }
        }.instancePrint();

        new I2() {
            @Override
            public void instancePrint() {
                System.out.println(2);
            }
        }.instancePrint();
    }
}

interface I1 {
    public static void staticPrint() {
        System.out.println("1");
    }

    void instancePrint();
}

interface I2 extends I1 {
    public static void staticPrint() {
        System.out.println("2");
    }

    //default void instancePrint() {}
    void instancePrint();
}
