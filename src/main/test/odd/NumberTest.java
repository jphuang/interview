package odd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

  @Test
  public void testNextGreaterElement() {
    Number number = new Number();
    int[] ints = number.nextGreaterElement(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2});
    System.out.println(Arrays.toString(ints));
  }

  @Test
  public void testNextGreaterElement2() {
    Number number = new Number();
    int[] ints = number.nextGreaterElement2(new int[] {4, 1, 2}, new int[] {1, 3, 4, 2});
    System.out.println(Arrays.toString(ints));
  }

    @org.junit.Test
    public void runningSum() {
        Number number = new Number();
        int[] sum = number.runningSum(new int[] {4, 1, 2});
        assert Arrays.equals(sum, new int[] {4, 5, 7});
    }

    @org.junit.Test
    public void pivotIndex() {
        Number number = new Number();
        int i = number.pivotIndex(new int[] {1, 7, 3, 6, 5, 6});
        assert i == 3;
        i = number.pivotIndex(new int[] {1, 2, 3});
        assert i == -1;

        i = number.pivotIndex(new int[] {-1, -1, -1, -1, -1, 0});
        assert i == 2;
    }
}
