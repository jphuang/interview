package binary;

public class Matrix {

  /**
   * 1351. 统计有序矩阵中的负数 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 请你统计并返回 grid 中 负数 的数目。
   *
   * @param grid 有序矩阵中 m * n
   * @return 负数 的数目
   */
  public int countNegatives(int[][] grid) {
    int count = 0;
    for (int[] ints : grid) {
      count += binarySearch(0, ints);
    }
    return count;
  }

  public int binarySearch(int x, int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    while (low < high) {
      int mid = (low + high) / 2;
      if (arr[mid] >= x) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return arr[low] < 0 ? arr.length - low : 0;
  }
}
