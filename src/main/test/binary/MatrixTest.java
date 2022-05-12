package binary;

import org.junit.jupiter.api.Test;

public class MatrixTest {
  @Test
  public void testCountNegatives() {
    int i =
        new Matrix()
            .countNegatives(
                new int[][] {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}});
    assert i == 8;
  }

  @Test
  public void testCountNegatives2() {
    int i =
        new Matrix()
            .countNegatives(
                new int[][] {
                  {
                    4, 3,
                  },
                  {1, 0},
                });
    assert i == 0;
  }

  @Test
  public void testCountNegatives3() {
    int i =
        new Matrix()
            .countNegatives(
                new int[][] {
                  {3, -1, -3, -3, -3}, {2, -2, -3, -3, -3}, {1, -2, -3, -3, -3}, {0, -3, -3, -3, -3}
                });
    assert i == 16;
  }
}
