package odd;

import org.junit.jupiter.api.Test;

public class NumberTest {
  @Test
  public void testHammingWeight() {
    int n = Integer.parseInt("00000000000000000000000010000000", 2);
    int i = Number.hammingWeight(n);
    assert i == 1;
  }

  @Test
  public void testIsHappy() {
    boolean happy = Number.isHappy(19);
    assert happy;
  }
}
