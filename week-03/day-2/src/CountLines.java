import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    try {
      Path filePath = Paths.get("assets/my-file.txt");
      List<String> lines = Files.readAllLines(filePath);
      System.out.println(lines.size());
    } catch (Exception e) {
      System.out.println("0");
    }
  }

}
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.