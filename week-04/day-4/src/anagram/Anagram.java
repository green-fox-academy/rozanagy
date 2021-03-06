package anagram;

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
    String input1 = "dog";
    String input2 = "god";

    boolean output = isAnagram(input1, input2);

    System.out.println(output);

  }

  public static boolean isAnagram(String input1, String input2) {
    //Remove all whitespace
    String s1 = input1.replaceAll(" ", "");
    String s2 = input2.replaceAll(" ", "");

    boolean status = true;

    if (s1.length() != s2.length()) {
      status = false;
    } else {      //Convert into character array
      char[] s1Array = s1.toLowerCase().toCharArray();
      char[] s2Array = s2.toLowerCase().toCharArray();

      Arrays.sort(s1Array);  //Sorting both character array
      Arrays.sort(s2Array);

      status = Arrays.equals(s1Array, s2Array);  //Check if both arrays are equal
    }
    return status;

  }
}
