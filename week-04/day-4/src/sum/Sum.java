package sum;

import java.util.ArrayList;

public class Sum {


    public int sum(ArrayList<Integer> listOfNumbers) {
        int sum = 0;
        for(int i : listOfNumbers) {
            sum += i;
        }
        return sum;
    }
}
