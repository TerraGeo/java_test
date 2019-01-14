package test.associate.inharitance;

public class InheritanceDemo3 {
    public static void main(String[] args) {
        System.out.println(new Student2("Bob").getName());
    }
}

abstract class Person2 {
    protected String name;

    public Person2(String name) {
        this.name = name;
    }

    public abstract String getName();
}
class Student2 extends Person2{

    public Student2(String name) {
        super(name); // comment the line and the code fails to compile
    }

    public String getName() {
        return name;
    }
}
