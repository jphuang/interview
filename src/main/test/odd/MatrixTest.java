package odd;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MatrixTest {
  @Test
  public void testMatrixReshape() {
    Matrix matrix = new Matrix();
    int[][] ints = matrix.matrixReshape(new int[][] {{1, 2}, {3, 4}}, 1, 4);
    System.out.println(Arrays.toString(ints));
    assert true;
  }

  @Test
  public void testMatrixReshape2() {
    Matrix matrix = new Matrix();
    int[][] ints = matrix.matrixReshape2(new int[][] {{1, 2}, {3, 4}}, 1, 4);
    System.out.println(Arrays.toString(ints));
    assert true;
  }
}
