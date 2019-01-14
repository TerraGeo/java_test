package test.associate.staticTasks;

public class InvalidStaticVarDeclarationDemo2 {
    int x = 10;
    static int y /*= x*/;

    InvalidStaticVarDeclarationDemo2() {
        y++;
    }

    public static void main(String[] args) {
        System.out.println(y + new InvalidStaticVarDeclarationDemo2().x);
    }
}
