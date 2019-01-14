package test.professional.io_demos;

import java.io.*;

public class BufferedWriterDemo1 {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"))) {
            writer.write("Tested test");
        }
        try(BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String fileString;

            while ((fileString = reader.readLine()) != null) {
                System.out.println(fileString);
            }
        }
    }
}
