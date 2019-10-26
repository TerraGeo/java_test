package test.professional.default_func_interfaces;

import java.util.function.DoubleSupplier;

public class DoubleSupplierOne {
    public static void main(String[] args) {
        DoubleSupplier supplier = () -> Math.random()*10;
        //System.out.println(supplier.get());
        System.out.println(supplier.getAsDouble());
    }
}
