public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 15;
    int currentMinutes = 48;
    int currentSeconds = 12;

    int secondsInADay = 86400;


    System.out.println(secondsInADay %= ((currentHours * 3600) + (currentMinutes * 60) + currentSeconds));
  }
}