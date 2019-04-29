package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int index = 10;
        System.out.println(getFibonacciNumber(index));
    }

    public static int getFibonacciNumber(int index) {
        int a = 0;
        int b = 1;
        int c;
        if (index == 0)
            return a;
        for (int i = 2; i <= index; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}



