import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner numOne = new Scanner(System.in);
        System.out.println("Number of girls that comes to a party");

        int numberOfGirls = numOne.nextInt();

        Scanner numTwo = new Scanner(System.in);
        System.out.println("Number of boys that comes to a party");
        int numberOfBoys = numTwo.nextInt();


        int allThePeople = numberOfGirls + numberOfBoys;

        if (numberOfGirls == numberOfBoys && allThePeople >= 20) {
            System.out.println("The party is excellent!");
        } else if (numberOfGirls != numberOfBoys && allThePeople >= 20 && numberOfGirls!=0) {
            System.out.println("Quite cool party!");
        } else if (numberOfGirls !=0) {
            System.out.println("Average party...");
        } else {
            System.out.println("Sausage party");
        }
    }
}
