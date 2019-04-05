public class CodingHours {
    public static void main(String[] args) {
        int DailyCodingHours = 6;
        int WeeklyCodingHours = DailyCodingHours * 5;
        int WeeklyWorkHours = 52;
        int SemesterWorkHours = WeeklyWorkHours * 17;


        System.out.println("An attendee spends "+ WeeklyCodingHours * 17 + " hours with coding in a semester.");
        System.out.println("The percentage of the coding hour is " + (WeeklyCodingHours * 17) * 100 / SemesterWorkHours );
    }
}
