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
  // 1588. 所有奇数长度子数组的和
  // 给你一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
  // 子数组 定义为原数组中的一个连续子序列。
  // 请你返回 arr 中 所有奇数长度子数组的和 。
  public int sumOddLengthSubArrays(int[] arr) {
    int maxSum = 0;
    for (int len = 1; len <= arr.length; len += 2) {
      Deque<Integer> queue = new LinkedList<>();
      int sum = 0;
      for (int i = 0; i < len; i++) {
        queue.add(arr[i]);
        sum += arr[i];
      }
      maxSum += sum;
      for (int start = 1; start < arr.length; start++) {
        int end = start + len - 1;
        if (end >= arr.length) {
          break;
        }
        int n = queue.pollFirst();
        sum = sum + arr[end] - n;
        maxSum += sum;
        queue.offerLast(arr[end]);
      }
    }
    return maxSum;
  }

  public int sumOddLengthSubArrays2(int[] arr) {
    int maxSum = 0;
    int[] preSum = new int[arr.length + 1];
    preSum[0] = 0;
    for (int i = 0; i < arr.length; i++) {
      preSum[i + 1] = preSum[i] + arr[i];
    }
    for (int len = 1; len <= arr.length; len += 2) {
      for (int start = 0; start <= arr.length; start++) {
        int end = start + len - 1;
        if (end >= arr.length) {
          break;
        }
        maxSum += preSum[end + 1] - preSum[start];
      }
    }
    return maxSum;
  }
}
