package sum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum;

    @Before
    public void setup() {
        sum = new Sum();
    }


    @Test
    public void sumShouldAddNumbersCorrectly() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10);
        listOfNumbers.add(12);
        assertEquals(22,sum.sum(listOfNumbers));
    }

    @Test
    public void sumShouldNotAddNumbersCorrectly() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10);
        listOfNumbers.add(12);
        assertNotEquals(25,sum.sum(listOfNumbers));
    }

    @Test
    public void sumWithAnEmptyListShouldReturnZero() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        assertEquals(0, sum.sum(listOfNumbers));

    }

    @Test
    public void sumWithAListWithOneElementShouldReturnThatOneElement() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(10);
        assertEquals(10, sum.sum(listOfNumbers));
    }

    @Test (expected = NullPointerException.class)
    public void sumWithAListWithNullElementShouldThrowAnException() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(null);
        sum.sum(listOfNumbers);
    }


}