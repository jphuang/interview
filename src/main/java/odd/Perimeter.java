package odd;

import java.util.Arrays;

public class Perimeter {
  // 976. 三角形的最大周长
  // 给定由一些正数（代表长度）组成的数组 nums ，返回 由其中三个长度组成的、面积不为零的三角形的最大周长 。如果不能形成任何面积不为零的三角形，返回 0。
  public static int largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    for (int i = nums.length - 1; i >= 2; i--) {
      if (nums[i] < (nums[i - 1] + nums[i - 2])) {
        return nums[i] + nums[i - 1] + nums[i - 2];
      }
    }
    return 0;
  }
  // 1779. 找到最近的有相同 X 或 Y 坐标的点
  // 给你两个整数 x 和 y ，表示你在一个笛卡尔坐标系下的 (x, y) 处。同时，在同一个坐标系下给你一个数组 points ，其中 points[i] = [ai, bi] 表示在
  //  (ai, bi) 处有一个点。当一个点与你所在的位置有相同的 x 坐标或者相同的 y 坐标时，我们称这个点是 有效的 。
  // 请返回距离你当前位置 曼哈顿距离 最近的 有效 点的下标（下标从 0 开始）。如果有多个最近的有效点，请返回下标 最小 的一个。如果没有有效点，请返回 -1 。
  public int nearestValidPoint(int x, int y, int[][] points) {
    int length = points.length;
    int max = Integer.MAX_VALUE;
    int index = -1;
    for (int i = 0; i < length; i++) {
      int[] point = points[i];
      if (point[0] == x || point[1] == y) {
        int i1 = Math.abs(point[0] - x) + Math.abs(point[1] - y);
        if (i1 < max) {
          max = i1;
          index = i;
        }
      }
    }
    return index;
  }
}
