package apple;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AppleTest {
    Apple apple;


    @Before
    public void setup() {
        apple = new Apple();
    }

    @Test
    public void itShoulNotReturnCorrectly() {
        assertNotEquals("pear", apple.getApple());
    }

    @Test
    public void itShouldReturnCorrectly() {
        assertEquals("apple", apple.getApple());
    }

}