package test.professional.console;

import java.io.Console;

public class ConsolePasswordOne {
    public static void main(String[] args) {
        Console console = System.console();
        /*String s = console.readPassword("Password: ");
        if (s.equals("Pass")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry, try again");
        }*/

        char[] pass = console.readPassword("Password: ");

        if (pass.equals(new char[]{'P', 'a', 's', 's'})) {
            System.out.println("Welcome");
        } else {
            System.out.println("Sorry, try again");
        }
    }
}
