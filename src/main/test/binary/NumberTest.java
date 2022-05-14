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

  @Test
  public void testCheckIfExist() {
    Number number = new Number(0);
    boolean b = number.checkIfExist(new int[] {-10, 12, -20, -8, 15});
    assert b;
  }

  @Test
  public void testCheckIfExist2() {
    Number number = new Number(0);
    boolean b = number.checkIfExist(new int[] {-2, 0, 10, -19, 4, 6, -8});
    assert !b;
  }
}
