package binary;

import org.junit.Test;

public class PositiveTest {
  @Test
  public void testFindKthPositive() {
    int kthPositive = new Positive().findKthPositive(new int[] {2, 3, 4, 7, 11}, 5);
    System.out.println(kthPositive);
    assert kthPositive == 9;
  }
}
