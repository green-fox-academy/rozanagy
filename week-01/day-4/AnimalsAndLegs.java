import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many chickens the farmer has?");
        int numberOfChickens = scanner.nextInt();
        System.out.println("How many pigs the farmer has?");
        int numberOfPigs = scanner.nextInt();

        int numberOfLegs = (numberOfChickens * 2) + (numberOfPigs * 4);
        System.out.println("The animals have " + numberOfLegs + " legs.");
    }
}
// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have