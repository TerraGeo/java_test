package test.io_demos;

import java.io.Closeable;
import java.io.Console;
import java.io.InputStream;
import java.util.ArrayList;

public class SystemConsoleDemo1 {
    public static void main(String[] args) {
        /*Console console = System.console();
        String uname = console.readLine("User Name: ");
        char[] password = console.readPassword("Password: ");

        System.out.println("User name: " + uname.toString());
        System.out.println("Password");

        for (char c : password) {
            System.out.print(c);
        }*/
        new ArrayList<Closeable>() {{add(System.in); add(System.out); add(System.err);}}.stream()
                                                                                        .map(Closeable::getClass)
                                                                                        .forEach(System.out::println);
    }
}
