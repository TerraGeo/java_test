package test.inharitance;

import java.io.IOException;
import java.time.Period;

public class InheritanceDemo1 {
    public static void main(String[] args) {
        Livera livera = new Livera("Livera", 22);
        Person p = livera;
        livera.read();
        p.read();
    }
}

class Person {
    int age;
    String name;

    public void read() {
        System.out.println("Person reads.");
    }

    private void other() {}
}

class Livera extends Person {
    public Livera(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void read() {
        System.out.println(name + " reads.");
    }

    public void other() throws Exception {}
}
