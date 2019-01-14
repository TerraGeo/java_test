package test.professional.nio_demos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BasicAttributes {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\serhii.ivanov\\IdeaProjects\\Test\\src\\FileCreationDemo.java");
        System.out.println(Files.getOwner(path));
    }
}
