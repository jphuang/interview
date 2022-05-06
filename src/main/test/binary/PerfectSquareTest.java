package binary;

import odd.PerfectSquare;
import org.junit.jupiter.api.Test;

public class PerfectSquareTest {
  @Test
  public void testIsPerfectSquare3() {
    PerfectSquare perfectSquare = new PerfectSquare();
    boolean perfectSquare3 = perfectSquare.isPerfectSquare3(2147483647);
    assert perfectSquare3;
  }
}
