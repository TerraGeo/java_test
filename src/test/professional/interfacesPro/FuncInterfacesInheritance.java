package test.professional.interfacesPro;

public interface FuncInterfacesInheritance {
}

interface One extends Two{

}

interface Two<T> {
    public void print(T t);
}

interface Three<T> extends One, Two {
    public void printer(T t);
}
