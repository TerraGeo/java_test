package test.staticTasks;

public class StaticInitializationDemo1 {
    public static void main(String[] args) {
        new SubSubClass("ABC");
    }
}

class MainClass {
    MainClass() {
        System.out.println("MainClass ");
    }
}

class SubClass extends MainClass {
    {
        System.out.println("Init ");
    }

    static {
        System.out.println("Static ");
    }

    SubClass() {
        super();
        System.out.println("Sub ");
    }
}

class SubSubClass extends SubClass {

    SubSubClass(String s) {
        super();
        System.out.println("SubSub ");
    }
}
