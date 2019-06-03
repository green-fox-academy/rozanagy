package anagram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anagram;

  @Before
  public void setup() {
    anagram = new Anagram();
  }

  @Test
  public void isAnagramShouldReturnTrueIfAnagram() {
    String word1 = "cat";
    String word2 = "act";
    assertEquals(true, anagram.isAnagram(word1, word2));

  }

  @Test
  public void isAnagramShouldReturnFalseIfNotAnagram() {
    String word1 = "cat";
    String word2 = "spaceship";
    assertEquals(false, anagram.isAnagram(word1, word2));

  }

  @Test
  public void isAnagramShouldReturnFalseIfEmptyString() {
    String word1 = "cat";
    String word2 = "";
    assertEquals(false, anagram.isAnagram(word1, word2));

  }


  @Test(expected = NullPointerException.class)
  public void isAnagramShouldThrowExceptionIfNull() {
    String word1 = "cat";
    String word2 = null;
    anagram.isAnagram(word1, word2);

  }


}