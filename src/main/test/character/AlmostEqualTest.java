package character;

import org.junit.jupiter.api.Test;

public class AlmostEqualTest {
  @Test
  public void testAlmostEqual() {
    AlmostEqual almostEqual = new AlmostEqual();
    boolean b = almostEqual.areAlmostEqual("bank", "kanb");
    assert b;
  }
}
