package test.professional.interfacesPro;

public interface DefaultInvocationDemo1 {
    /*default boolean equals(Object o) {
        return true;
    }*/
    default boolean equalz(Object o) {
        return true;
    }
}

class A implements DefaultInvocationDemo1 {
    public boolean equalz(Object o) {
        return false;
    }
}

class Demo {
    public static void main(String[] args) {
        A a = new A();
        DefaultInvocationDemo1 ia = new A();
        DefaultInvocationDemo1 i = new DefaultInvocationDemo1() {};
        System.out.println(a.equalz(ia) + " " + i.equalz(ia));
    }
}
