import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Type in a number!");

        int x = number.nextInt();
        int a = 1;

        do {
            System.out.println( a + " * " + x + " = " + a * x);
            a++;
        }
        while (a <= 10);


    }
}
