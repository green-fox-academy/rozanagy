package Exercise10;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    ArrayList<Fox> foxPack = new ArrayList<Fox>();
    Fox fox1 = new Fox("Mr.Fox", "red", 20);
    Fox fox2 = new Fox("Felicity Fox", "green", 15);
    Fox fox3 = new Fox("Ash Fox", "purple", 17);
    Fox fox4 = new Fox("Kristofferson Silverfox", "silver", 7);
    Fox fox5 = new Fox("Kyle", "green", 3);

    foxPack.add(fox1);
    foxPack.add(fox2);
    foxPack.add(fox3);
    foxPack.add(fox4);
    foxPack.add(fox5);

    foxPack.stream()
        .filter(f -> f.getColor().equals("green"))
        .forEach(f -> System.out.println(f.getName()));

    foxPack.stream()
        .filter(f -> f.getColor().equals("green") && f.getAge() < 5)
        .forEach(f -> System.out.println(f.getName()));

    Map<String, Integer> frequency = foxPack.stream()
        .collect(Collectors.groupingBy(f -> f.getColor(), Collectors.summingInt(f -> 1)));
    System.out.println(frequency.toString());
  }
}
