public class numberAdded {
  public static void main(String[] args) {
    System.out.println(numberAdded(5));
  }

  public static int numberAdded(int n) {
    if (n > 1) {
      return numberAdded(n - 1) + n;
    } else {
      return 1;
    }
  }
}

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.