package binary;

import org.junit.Test;

public class SpecialArrayTest {
  @Test
  public void testSpecialArray() {
    SpecialArray specialArray = new SpecialArray();
    int i = specialArray.specialArray(new int[] {3, 5});
    assert i == 2;
  }

  @Test
  public void testSpecialArray2() {
    SpecialArray specialArray = new SpecialArray();
    int i = specialArray.specialArray(new int[] {0, 0});
    assert i == -1;
  }

  @Test
  public void testSpecialArray3() {
    SpecialArray specialArray = new SpecialArray();
    int i = specialArray.specialArray(new int[] {0, 4, 3, 0, 4});
    assert i == 3;
  }
}
