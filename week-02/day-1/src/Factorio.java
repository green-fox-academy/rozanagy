public class Factorio {
    public static int factorio(int x) {
        int count = 1;
        for (int i = 1; i <= x; i++) {
            count *= i;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(factorio(7));
    }
}

//  Create the usual class wrapper
//  and main method on your own.
// - Create a function called `factorio`
//   that returns it's input's factorial
