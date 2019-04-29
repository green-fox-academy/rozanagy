package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  Fibonacci fibonacci;

  @Before
  public void setup() {
    fibonacci = new Fibonacci();
  }


  @Test
  public void getFibonacciShouldPrintNumberCorrectly() {
    int counter = 6;
    assertEquals(8, Fibonacci.getFibonacciNumber(counter));
  }

  @Test
  public void getFibonacciShouldNot() {
    int counter = 6;
    assertEquals(8, Fibonacci.getFibonacciNumber(counter));
  }
}