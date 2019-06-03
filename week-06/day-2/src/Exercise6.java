import java.util.stream.Collectors;

public class Exercise6 {
  public static void main(String[] args) {
    String word = "ExaMpleWIThuppErCases";

    word.chars()
        .filter(w -> Character.isUpperCase(w))
        .forEach(w -> System.out.println((char) w));
  }
}
//Exercise 6
//
//Write a Stream Expression to find the uppercase characters in a string!
