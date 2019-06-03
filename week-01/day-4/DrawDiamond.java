import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me an integer number!");
    int input = scanner.nextInt();
    int count = input - 1;

    for (int k = 1; k <= input; k++) {
      for (int i = 1; i <= count; i++)
        System.out.print(" ");
      count--;
      for (int i = 1; i <= 2 * k - 1; i++)
        System.out.print("*");
      System.out.println();
    }
    count = 1;
    for (int k = 1; k <= input - 1; k++) {
      for (int i = 1; i <= count; i++)
        System.out.print(" ");
      count++;
      for (int i = 1; i <= 2 * (input - k) - 1; i++)
        System.out.print("*");
      System.out.println();
    }

  }
}


// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was
