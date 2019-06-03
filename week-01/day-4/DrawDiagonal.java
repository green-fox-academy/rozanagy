import java.util.Scanner;

public class DrawDiagonal {
  public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    System.out.println("Type in a number");

    int number = myInput.nextInt();

    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number; j++) {
        if (i == 0 || j == 0 || i == j || i == number - 1 || j == number - 1 || i + j == number - 1)
          System.out.print("%");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }

}


// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was