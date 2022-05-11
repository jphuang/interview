package binary;

import odd.Sum;
import org.junit.Test;

import java.util.Arrays;

public class SumTest {
  @Test
  public void testTwoSum() {
    Sum sum = new Sum();
    int[] ints = sum.twoSum(new int[] {2, 7, 11, 15}, 9);
    assert ints[0] == 1;
    assert ints[1] == 2;
  }

  @Test
  public void testTwoSum2() {
    Sum sum = new Sum();
    int[] ints = sum.twoSum(new int[] {1, 2, 3, 4, 4, 9, 56, 90}, 8);
    System.out.println(Arrays.toString(ints));
    assert ints[0] == 4;
    assert ints[1] == 5;
  }
}
