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

  // 74. 搜索二维矩阵
  // 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
  //
  // 每行中的整数从左到右按升序排列。
  // 每行的第一个整数大于前一行的最后一个整数。
  public boolean searchMatrix(int[][] matrix, int target) {
    for (int[] ints : matrix) {
      if (ints[0] > target) {
        return false;
      }
      if (ints[ints.length - 1] >= target) {
        int low = 0;
        int high = ints.length;
        while (low < high) {
          int mid = (high - low) / 2 + low;
          if (ints[mid] == target) {
            return true;
          }
          if (ints[mid] < target) {
            low = mid + 1;
          } else {
            high = mid;
          }
        }
      }
    }
    return false;
  }
}
