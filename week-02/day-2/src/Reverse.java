public class Reverse {
  public static void myMethod(String a) {
    for (int i = a.length() - 1; i >= 0; --i) {
      System.out.print(a.charAt(i));
    }
  }

  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    myMethod(reversed);
  }
}
// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.
