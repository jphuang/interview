package odd;

import org.junit.jupiter.api.Test;

public class PerimeterTest {
  @Test
  public void testLargestPerimeter() {
    int[] nums = new int[] {2, 1, 2};
    int i = Perimeter.largestPerimeter(nums);
    assert i == 5;
    nums = new int[] {2, 1, 1};
    i = Perimeter.largestPerimeter(nums);
    assert i == 0;
  }
}
