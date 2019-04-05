import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner myConverter = new Scanner(System.in);
        System.out.println("Type a distance in kilometer");

        int distance = myConverter.nextInt();
        System.out.println("This is " + distance * 1.60934 + " miles.");
    }
}
