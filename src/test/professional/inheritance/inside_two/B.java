package test.professional.inheritance.inside_two;

import test.professional.inheritance.inside_one.A;

public class B extends A {
    public static void main(String[] args) {
        A a = new A();
        //this.change();
        a.change();
        //System.out.println(a.j);
        System.out.println(new B().j);

        B b = new B();
        b.change();
        System.out.println(b.j);
    }
}
