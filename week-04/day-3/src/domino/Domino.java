package domino;

import java.util.Arrays;

public class Domino implements Comparable<Domino>{
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    public int compareTo(Domino other) {
        if(left < other.left) {
            return -1;
        }

        if(left == other.left) {
            return 0;
        }
        return -1;
    }


}
