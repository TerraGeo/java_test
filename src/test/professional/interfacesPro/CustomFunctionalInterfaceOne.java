package test.professional.interfacesPro;

public interface CustomFunctionalInterfaceOne<T> {
    T apply(T t);
}

class CustomFunctionalInterfaceOneDemo {
    public static void main(String[] args) {
        CustomFunctionalInterfaceOne<String> correctOne = String::toUpperCase;
        //CustomFunctionalInterfaceOne<String> incorrectWithInt = String::length;
        //CustomFunctionalInterfaceOne<String> returnWithoutCurlyBraces = s -> return s;
        //CustomFunctionalInterfaceOne<String> functionWithoutParams = () -> "afds";
        CustomFunctionalInterfaceOne<String> correctSecond = (s) -> s.toLowerCase();

    }
}
