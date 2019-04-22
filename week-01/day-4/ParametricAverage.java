import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an integer number!");
        int askThisManyTimes = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i < askThisManyTimes; i++) {
            System.out.println("Give me another number!");
            sum = sum + scanner.nextInt();
        }
        System.out.println("Sum: " + sum + ", " + "Average: " + sum / askThisManyTimes);
    }
}
// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
