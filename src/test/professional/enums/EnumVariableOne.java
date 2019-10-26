package test.professional.enums;

public enum EnumVariableOne {
    //private int DAYS;

    MARCH(31),
    APRIL(30);

    private int DAYS;

    EnumVariableOne(int DAYS) {
        this.DAYS = DAYS;
    }
}

class EnumDemoOne {
    public static void main(String[] args) {
        System.out.println(EnumVariableOne.values());
    }
}
