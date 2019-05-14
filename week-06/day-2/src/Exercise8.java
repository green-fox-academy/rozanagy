import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  public static void main(String[] args) {
    List<Character> myCharacters = Arrays.asList('H', 'e', 'l', 'l', 'o');

    String myString = myCharacters.stream()
        .map(String :: valueOf).collect(Collectors.joining());

    System.out.println(myString);
  }
}
//Write a Stream Expression to concatenate a Character list to a string!
