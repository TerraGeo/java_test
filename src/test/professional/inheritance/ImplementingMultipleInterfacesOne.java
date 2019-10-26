package test.professional.inheritance;

import java.io.File;

public class ImplementingMultipleInterfacesOne implements InterOne, InterTwo {

    public static void main(String[] args) {
        InterOne interOne = new ImplementingMultipleInterfacesOne();
        interOne.print();
        //new Demo().print();
    }

    @Override
    public void print() {
        System.out.println("Opa!");
    }
}

interface InterOne {
    void print();
}

interface InterTwo /*extends InterOne*/{ // uncomment and this is legal too
    void print();
}

interface InterDefaultOne {
    default void print() {
        System.out.println("one");
    }
}

interface InterDefaultTwo {
    default void print() {
        System.out.println("two");
    }
}

/*class Demo implements InterDefaultOne, InterDefaultTwo {
    *//*@Override
    public void print() {
        System.out.println("Demo");
    }*//*
}*/
