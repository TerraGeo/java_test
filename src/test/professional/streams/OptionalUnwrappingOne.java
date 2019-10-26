package test.professional.streams;

import java.util.Optional;

public class OptionalUnwrappingOne {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("String");
        Optional<String> stringOptionalTwo = Optional.empty();

        System.out.println(stringOptional);
        System.out.println(stringOptional.get());
        System.out.println(stringOptional.orElseGet(() -> "Or else get string"));
        System.out.println(stringOptional.orElse("Or else string"));
        System.out.println(stringOptionalTwo.orElse(stringOptional.get()));
    }
}
