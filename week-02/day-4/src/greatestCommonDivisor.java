public class greatestCommonDivisor {
    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(100, 80));
    }
}
//Find the greatest common divisor of two numbers using recursion.
