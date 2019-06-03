import java.util.Scanner;

public class CountFromTo {
  public static void main(String[] args) {
    Scanner first = new Scanner(System.in);
    System.out.println("Type in a number!");

    int numOne = first.nextInt();

    Scanner second = new Scanner(System.in);
    System.out.println("Type in another number!");

    int numTwo = second.nextInt();

    if (numTwo <= numOne) {
      System.out.println("The second number should be bigger");
    } else {
      do {
        System.out.println(numOne);
        numOne++;
      }
      while (numOne <= numTwo);


    }
  }

}
