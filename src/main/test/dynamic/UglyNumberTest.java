package dynamic;

import org.junit.jupiter.api.Test;

public class UglyNumberTest {
  @Test
  public void testNthUglyNumber() {
    UglyNumber number = new UglyNumber();
    long i = number.nthUglyNumber(1407);
    assert i == 536870912;
  }

  @Test
  public void testNthUglyNumber2() {
    UglyNumber number = new UglyNumber();
    long i = number.nthUglyNumber2(1407);
    assert i == 536870912;
  }
}
