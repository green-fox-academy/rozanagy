import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
  public static void main(String[] args) {
    String myString = "This is just an example sentence";

    Map<Character, Integer> frequency = myString.chars()
        .mapToObj(s -> (char) s)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(s -> 1)));

    System.out.println(frequency);
  }
}
//Write a Stream Expression to find the frequency of characters in a given string!
