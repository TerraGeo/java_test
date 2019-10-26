package test.professional.io_demos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriter {
    public static void main(String[] args) throws Exception{
        File input = new File("test.txt");
        File output = new File("dest.txt");
        FileReader instream = null;
        FileWriter outstream = null;
        try {
            instream = new FileReader(input);
            outstream = new FileWriter(output);
            int c;

            while ((c = instream.read()) != -1) {
                outstream.write(c);
            }
        }finally {
            if (instream != null) {
                instream.close();
            }
            if (outstream != null) {
                outstream.close();
            }
        }
    }
}
