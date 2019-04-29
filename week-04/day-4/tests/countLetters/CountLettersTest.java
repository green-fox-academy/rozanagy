package countLetters;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    CountLetters countLetters;

    @Before
    public void setup() {
        countLetters = new CountLetters();
    }

    @Test
    public void counterLettersDictionaryShouldReturnWithCorrectValue() {
        HashMap<Character, Integer> myTestMap = new HashMap<>();
        myTestMap.put('c', 1);
        myTestMap.put('u', 1);
        myTestMap.put('p', 1);
        assertEquals(myTestMap, countLetters.counterLettersDictionary("cup"));
    }

    @Test
    public void counterLettersDictionaryShouldNotReturnWithCorrectValue() {
        HashMap<Character, Integer> myTestMap = new HashMap<>();
        myTestMap.put('c', 4);
        myTestMap.put('u', 1);
        myTestMap.put('p', 1);
        assertNotEquals(myTestMap, countLetters.counterLettersDictionary("cup"));
    }

    @Test(expected = NullPointerException.class)
    public void counterLetterDictionaryShouldThrowExceptionIfEmptyMap() {
        HashMap<Character, Integer> myTestMap = new HashMap<>();
        myTestMap.put(null, null);
        countLetters.counterLettersDictionary("cup");
    }

}