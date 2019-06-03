import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListIntroduction2 {
  public static void main(String[] args) {
    ArrayList<String> ListA = new ArrayList<String>();
    ListA.add("Apple");
    ListA.add("Avocado");
    ListA.add("Blueberries");
    ListA.add("Durian");
    ListA.add("Lychee");


    ArrayList<String> ListB = new ArrayList<String>();
    ListB.add("Apple");
    ListB.add("Avocado");
    ListB.add("Blueberries");
    ListB.add("Durian");
    ListB.add("Lychee");


    if (ListA.contains("Durian")) {
      System.out.println("ListA contains Durian.");
    }

    ListB.remove("Durian");
    System.out.println(ListB);

    ListA.add(4, "Kiwifruit");
    System.out.println(ListA);

    System.out.println(ListA.size());
    System.out.println(ListB.size());

    System.out.println(ListA.indexOf("Avocado"));
    System.out.println(ListB.indexOf("Durian"));

    ListB.addAll
  }
}
