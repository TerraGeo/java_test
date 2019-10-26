package test.professional.default_func_interfaces;

import java.util.function.IntSupplier;

public class CustomIntSupplierOne {
    public static void main(String[] args) {
        IntSupplier ints = CustomIntSupplierOne::getRandTen;
        //System.out.println(ints.get());
        System.out.println(ints.getAsInt());
    }

    public static int getRandTen() {
        return (int)(Math.random() * 10) + 1;
    }
}
