package test.professional.io_demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderOne {
    public static void main(String[] args) {
        int i;

        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        try {
            i = bufferedReader.read();
            System.out.println("ASCII value of " + (char) i + " is " + i);
        }catch (IOException e) {

        }
    }
}
