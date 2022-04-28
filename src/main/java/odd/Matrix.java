package odd;

public class Matrix {
  // 1572. 矩阵对角线元素的和
  // 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
  //
  // 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
  public int diagonalSum(int[][] mat) {
    int sum = 0;
    for (int i = 0; i < mat.length; i++) {
      sum += mat[i][i];
      if (i != (mat.length - 1 - i)) {
        sum += mat[i][mat.length - 1 - i];
      }
    }
    return sum;
  }
}
