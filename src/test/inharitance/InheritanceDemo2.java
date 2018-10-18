package test.inharitance;

public class InheritanceDemo2 {
    public static void main(String[] args) {
        ((SuperClass) new SubSub()).method();
    }
}

class SuperClass {
    public void method() {
        System.out.println("Super");
    }
}

/*final*/ class Sub extends SuperClass {
    public void method() {
        System.out.println("Sub");
    }
}

class SubSub extends Sub {
    public void method() {
        System.out.println("SubSub");
    }
}
