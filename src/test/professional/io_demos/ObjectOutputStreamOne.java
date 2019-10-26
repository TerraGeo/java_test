package test.professional.io_demos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamOne {
    public static void main(String[] args) {
        int i = 123;
        System.out.println();

        try {
            FileOutputStream out = new FileOutputStream("object_output.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(i);
        } catch (Exception e) {

        }
    }
}
