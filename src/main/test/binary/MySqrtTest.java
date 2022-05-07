package binary;

import org.junit.jupiter.api.Test;

public class MySqrtTest {
  @Test
  public void testMySqrt() {
    MySqrt mySqrt = new MySqrt();
    int i = mySqrt.mySqrt2(8);
    assert i == 2;
  }
}
