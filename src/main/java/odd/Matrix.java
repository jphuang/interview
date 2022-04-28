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
  // 566. 重塑矩阵
  // 在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个 m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。
  // 给你一个由二维数组 mat 表示的 m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。
  // 重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。
  // 如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
  public int[][] matrixReshape(int[][] mat, int r, int c) {
    if (mat.length * mat[0].length != r * c) return mat;
    int[][] ans = new int[r][c];
    int h = 0, w = 0;
    for (int i = 0; i < mat.length; i++) {
      for (int num : mat[i]) {
        ans[h][w] = num;
        if (w++ > c) {
          h++;
          w = 0;
        }
      }
    }
    return ans;
  }

  public int[][] matrixReshape2(int[][] mat, int r, int c) {
    int m = mat.length;
    int n = mat[0].length;
    if (m * n != r * c) return mat;
    int[][] ans = new int[r][c];
    for (int i = 0; i < m * n; i++) {
      ans[i / c][i % c] = mat[i / n][i % n];
    }
    return ans;
  }
}
