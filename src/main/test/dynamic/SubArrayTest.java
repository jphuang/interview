package dynamic;

import org.junit.jupiter.api.Test;

public class SubArrayTest {
  @Test
  public void testMaxSubArray() {
    SubArray subArray = new SubArray();
    int i = subArray.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
    assert i == 6;
  }

  @Test
  public void testMaxSubArray2() {
    SubArray subArray = new SubArray();
    int i = subArray.maxSubArray2(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
    assert i == 6;
  }

  @Test
  public void testMaxSubArray3() {
    SubArray subArray = new SubArray();
    int i = subArray.maxSubArray3(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
    assert i == 6;
  }

  @Test
  public void testMaxSubArray4() {
    SubArray subArray = new SubArray();
    int i = subArray.maxSubArray4(new int[] {-2, 1});
    assert i == 1;
  }
}
