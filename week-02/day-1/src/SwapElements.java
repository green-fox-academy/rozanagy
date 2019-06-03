import javax.sound.midi.Soundbank;

public class SwapElements {
  public static void main(String[] args) {
    String[] abc = new String[]{"first", "second", "third"};
    System.out.println("Original array: ");
    for (int i = 0; i < abc.length; i++) {
      System.out.println(abc[i] + " ");
    }
    System.out.println();
    System.out.println("Array in reverse order: ");
    for (int i = abc.length - 1; i >= 0; i--) {
      System.out.println(abc[i] + " ");
    }
  }
}
// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
