public class sumDigit {
    public static int sumOfDigit(int n) {
        if (n == 0)
            return 0;
        return (n % 10 + sumOfDigit(n/10));
    }
    public static void main(String[] args) {
        int n = 145637;
        System.out.println(sumOfDigit(n));
    }
}
/* Given a non-negative int n, return the sum of its digits recursively (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
*/
