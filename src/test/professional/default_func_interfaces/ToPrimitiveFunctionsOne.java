package test.professional.default_func_interfaces;

import java.util.Date;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ToPrimitiveFunctionsOne {
    public static void main(String[] args) {
        ToIntFunction<String> stingToIngPlusFive = s -> Integer.valueOf(s) + 5;
        ToLongFunction<Date> dateMillis = Date::getTime;
        ToDoubleFunction<String> stringToDoublePlusHalf = s -> Integer.valueOf(s) + 0.5;

        System.out.println(stingToIngPlusFive.applyAsInt("72"));
        System.out.println(dateMillis.applyAsLong(new Date()));
        System.out.println(stringToDoublePlusHalf.applyAsDouble("72"));
    }
}
