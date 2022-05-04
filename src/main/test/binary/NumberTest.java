package binary;

import org.junit.jupiter.api.Test;

public class NumberTest {
  @Test
  public void testGuessNumber() {
    Number number = new Number(6);
    int i = number.guessNumber(10);
    assert i == 6;
  }

  @Test
  public void testGuessNumber2() {
    Number number = new Number(1);
    int i = number.guessNumber(1);
    assert i == 1;
  }
}
