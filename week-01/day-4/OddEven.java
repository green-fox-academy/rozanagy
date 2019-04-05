import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Type in a number");

        int number = myInput.nextInt();

        if (number % 2 == 0)
            System.out.println("The number is even.");
        else
            System.out.println("The number is odd.");



    }


}
