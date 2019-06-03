import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopyFile {
  public static void main(String[] args) {
    System.out.println(copyFile("assets/originalFile.txt", "assets/destinationFile.txt"));
  }

  public static boolean copyFile(String copyFromFile, String copyToFile) {
    Path src = Paths.get(copyFromFile);
    Path dest = Paths.get(copyToFile);
    try {
      Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }
}
// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
