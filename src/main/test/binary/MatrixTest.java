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

  @Test
  public void testSearchMatrix() {
    boolean i =
        new Matrix()
            .searchMatrix(new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13);
    assert !i;
  }

  @Test
  public void testSearchMatrix2() {
    boolean i = new Matrix().searchMatrix(new int[][] {{1}}, 1);
    assert i;
  }

  @Test
  public void testSearchMatrix3() {
    boolean i = new Matrix().searchMatrix(new int[][] {{1, 3}}, 3);
    assert i;
  }
}
