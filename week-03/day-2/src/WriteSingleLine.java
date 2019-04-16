import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {
    public static void main(String[] args) {
        String name = "Roza Nagy";
        addSingleLine(name, "assets/my-file.txt");
    }
    public static void addSingleLine (String name, String pathname) {
        List<String> content = new ArrayList<>();
        content.add(name);
        try {
            Path filePath = Paths.get(pathname);
            Files.write(filePath, content);
        } catch (Exception e) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}
// Write a function that is able to manipulate a file
// By writing your name into it as a single line
// The file should be named "my-file.txt"
// In case the program is unable to write the file,
// It should print the following error message: "Unable to write file: my-file.txt"