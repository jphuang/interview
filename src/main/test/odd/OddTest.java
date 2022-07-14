package odd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class OddTest {

  @Test
  public void testMoveZeroes() {
    int[] nums = new int[] {0, 1, 0, 3, 12};
    new Odd().moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
    assert true;
  }

  @Test
  public void testMoveZeroes2() {
    int[] nums = new int[] {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
    new Odd().moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
    assert true;
  }

  @Test
  public void reverse() {
    Odd odd = new Odd();
    Assertions.assertEquals(21, odd.reverse(12), "21");
    Assertions.assertEquals(-21, odd.reverse(-12), "-21");
    Assertions.assertEquals(-21, odd.reverse(-120), "-120");
    Assertions.assertEquals(0, odd.reverse(-2123456789), "-2123456789");
  }
}
