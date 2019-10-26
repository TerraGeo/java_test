package test.professional.enums;

public enum PublicEnumConstructorOne {
    FAST(2),
    SLOW(1),
    FASTER(3);

    private final int value;

    /*public*/ PublicEnumConstructorOne(int value) {
        this.value = value;
    }
}

class Demo {
    public static void main(String[] args) {
        System.out.println(PublicEnumConstructorOne.SLOW == PublicEnumConstructorOne.FAST);
    }
}
