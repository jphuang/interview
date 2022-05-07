package binary;

import org.junit.jupiter.api.Test;

public class LetterTest {
  @Test
  public void testNextGreatestLetter() {
    Letter letter = new Letter();
    char c = letter.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'c');
    assert c == 'f';
  }

  @Test
  public void testNextGreatestLetter2() {
    Letter letter = new Letter();
    char c = letter.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'j');
    assert c == 'c';
  }
}
