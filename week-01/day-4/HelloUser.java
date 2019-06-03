import java.util.Scanner;

public class HelloUser {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Type your name");

    String name = myObj.nextLine();
    System.out.println("Hello " + name + "!");
  }
}
