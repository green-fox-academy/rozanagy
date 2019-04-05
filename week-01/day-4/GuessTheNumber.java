import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int numberToGuess = 42;
        Scanner input = new Scanner(System.in);


        System.out.println("Guess the number!");
        int number = input.nextInt();

        if (number == numberToGuess) {
            System.out.println("You found the number: 42");
        }            else if (number < numberToGuess) {
            System.out.println("The stored number is higher");
        }else
            System.out.println("The stored number is lower");
            }
        }









// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8