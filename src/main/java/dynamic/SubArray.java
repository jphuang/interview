package dynamic;

import java.util.Deque;
import java.util.LinkedList;

public class SubArray {
  // 53. 最大子数组和
  // 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
  //
  // 子数组 是数组中的一个连续部分

  public int maxSubArray(int[] nums) {
    int length = nums.length;
    int max = Integer.MIN_VALUE;

    for (int len = 1; len <= length; len++) {
      Deque<Integer> queue = new LinkedList<>();
      int sum = 0;
      for (int i = 0; i < len; i++) {
        queue.add(nums[i]);
        sum += nums[i];
      }
      if (sum > max) {
        max = sum;
      }
      for (int start = 1; start < length; start++) {
        int end = start + len - 1;
        if (end >= length) {
          break;
        }
        int n = queue.pollFirst();
        sum = sum + nums[end] - n;
        max = Math.max(max, sum);
        queue.offerLast(nums[end]);
      }
    }
    return max;
  }

  public int maxSubArray2(int[] nums) {
    int length = nums.length;
    int max = Integer.MIN_VALUE;
    int[][] p = new int[length][length];
    for (int len = 1; len <= length; len++) {
      for (int start = 0; start < length; start++) {
        int end = start + len - 1;
        if (end >= length) {
          break;
        }
        p[start][end] = (len == 1) ? nums[end] : p[start][end - 1] + nums[end];
        max = Math.max(max, p[start][end]);
      }
    }
    return max;
  }

  public int maxSubArray3(int[] nums) {
    int max = nums[0];
    int pre = nums[0];
    for (int i = 1; i < nums.length; i++) {
      pre = Math.max(nums[i], nums[i] + pre);
      max = Math.max(max, pre);
    }
    return max;
  }

  public int maxSubArray4(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] > 0) {
        nums[i] += nums[i - 1];
      }
      max = Math.max(max, nums[i]);
    }
    return max;
  }
}
