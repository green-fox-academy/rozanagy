public class power {
  public static int power(int base, int n) {
    if (n == 1) {
      return base;
    } else {
      return power(base, n - 1) * base;
    }
  }

  public static void main(String[] args) {
    System.out.println(power(5, 3));
  }
}
/*Given base and n that are both 1 or more, compute recursively (no loops)
 the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
*/
