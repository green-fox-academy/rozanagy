public class bunnies {
  public static int earCounter(int n) {
    if (n == 1) {
      return 2;
    } else {
      return earCounter(n - 1) + 2;
    }
  }

  public static void main(String[] args) {
    System.out.println(earCounter(1));
  }
}

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies
// recursively (without loops or multiplication).