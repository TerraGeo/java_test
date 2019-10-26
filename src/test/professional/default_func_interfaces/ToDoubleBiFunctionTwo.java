package test.professional.default_func_interfaces;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionTwo {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Integer> ob = (f1, f2) -> f1 + f2;
        //System.out.println(ob.apply(1, 2));
        System.out.println(ob.applyAsDouble(1, 2));
    }
}
