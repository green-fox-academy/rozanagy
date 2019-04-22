import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two integer numbers!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a < b) {
            System.out.println("The bigger number is " + b);
        } else {
            System.out.println("The bigger number is " + a);
        }
    }

}
// Write a program that asks for two numbers and prints the bigger one
