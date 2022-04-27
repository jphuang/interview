package dynamic;

import org.junit.jupiter.api.Test;

public class ProductTest {
  @Test
  public void testGetMaxLen() {
    Product product = new Product();
    int maxLen = product.getMaxLen(new int[] {1, -2, -3, 4});
    assert maxLen == 4;
  }

  @Test
  public void testGetMaxLen2() {
    Product product = new Product();
    int maxLen = product.getMaxLen(new int[] {0, 1, -2, -3, -4});
    assert maxLen == 3;
  }

  @Test
  public void testGetMaxLen3() {
    Product product = new Product();
    int maxLen = product.getMaxLen(new int[] {1, 2, 3, 5, -6, 4, 0, 10});
    assert maxLen == 4;
  }
}
