package binary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

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
  // 1337. 矩阵中战斗力最弱的 K 行
  // 给你一个大小为 m * n 的矩阵 mat，矩阵由若干军人和平民组成，分别用 1 和 0 表示。
  // 请你返回矩阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。
  // 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。
  // 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。。
  public int[] kWeakestRows(int[][] mat, int k) {
    int m = mat.length;
    int n = mat[0].length;
    List<int[]> power = new ArrayList<int[]>();
    // 二分查找第一个0的位置
    for (int i = 0; i < m; i++) {
      int left = 0;
      int right = n - 1;
      int pos = -1;
      while (left <= right) {
        int mid = (left + right) / 2;
        if (mat[i][mid] == 0) {
          right = mid - 1;
        } else {
          left = mid + 1;
          pos = mid;
        }
      }
      power.add(new int[] {pos + 1, i});
    }

    // 最小堆
    PriorityQueue<int[]> queue =
        new PriorityQueue<>(
            new Comparator<int[]>() {
              @Override
              public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                  return o1[0] - o2[0];
                } else {
                  return o1[1] - o2[1];
                }
              }
            });
    for (int[] ints : power) {
      queue.offer(ints);
    }
    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
      ans[i] = queue.poll()[1];
    }
    return ans;
  }
}
