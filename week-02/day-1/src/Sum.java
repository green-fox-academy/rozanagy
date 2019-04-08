public class Sum {
    public static int sum(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            count += i;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}

// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter
