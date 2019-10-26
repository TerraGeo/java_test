package test.professional.io_demos;

import java.io.Console;

public class SystemWriteOne {
    public static void main(String[] args) {
        Console console = System.console();
        char[] pass = console.readPassword("Enter pass: ");
        //System.out.write("Your password is: ");
        for (int i: pass) {
            System.out.write(i);
            System.out.flush();
        }
    }
}
