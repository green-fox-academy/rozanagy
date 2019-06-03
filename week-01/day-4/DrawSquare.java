import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give me an integer number!");
    int dimension = scanner.nextInt();
    for (int i = 0; i < dimension; i++) {
      System.out.print("%");
    }
    System.out.println();

    for (int k = 0; k < dimension - 2; k++) {
      for (int j = 0; j < dimension; j++) {
        if (j == 0) {
          System.out.print("%");
        } else if (j == dimension - 1) {
          System.out.print("%");
          System.out.println();
        } else {
          System.out.print(" ");
        }
      }
    }
    for (int i = 0; i < dimension; i++) {
      System.out.print("%");
    }
  }
}


// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%%
// %    %
// %    %
// %    %
// %    %
// %%%%%%
//
// The square should have as many lines as the number was
