package dynamic;

import org.junit.jupiter.api.Test;

public class RobTest {
  @Test
  public void TestRob() {
    int[] nums = new int[] {1, 2, 3, 1};
    int rob = Rob.rob(nums);
    assert rob == 4;
  }

  @Test
  public void TestRob2() {
    int[] nums = new int[] {1, 2, 3, 1};
    int rob = Rob.rob2(nums);
    assert rob == 4;
  }
}
