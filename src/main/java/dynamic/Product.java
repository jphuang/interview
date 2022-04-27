package dynamic;

public class Product {
  // 152. 乘积最大子数组
  // 给你一个整数数组 nums ，请你找出数组中乘积最大的非空连续子数组（该子数组中至少包含一个数字），并返回该子数组所对应的乘积。
  // 测试用例的答案是一个 32-位 整数。
  // 子数组 是数组的连续子序列。
  public int maxProduct(int[] nums) {
    int ans = nums[0];
    int max = nums[0];
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int maxTemp = max;
      int minTemp = min;
      max = Math.max(Math.max(nums[i], maxTemp * nums[i]), Math.max(nums[i], minTemp * nums[i]));
      min = Math.min(Math.min(nums[i], maxTemp * nums[i]), Math.min(nums[i], minTemp * nums[i]));
      ans = Math.max(max, ans);
    }
    return ans;
  }
  // 1567. 乘积为正数的最长子数组长度
  // 给你一个整数数组 nums ，请你求出乘积为正数的最长子数组的长度。
  // 一个数组的子数组是由原数组中零个或者更多个连续数字组成的数组。
  // 请你返回乘积为正数的最长子数组长度。
  public int getMaxLen(int[] nums) {
    int positive = nums[0] > 0 ? 1 : 0;
    int negative = nums[0] < 0 ? 1 : 0;
    int maxLength = positive;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == 0) {
        positive = 0;
        negative = 0;
      }
      if (nums[i] > 0) {
        positive++;
        negative = negative > 0 ? negative + 1 : 0;
      }
      if (nums[i] < 0) {
        int positiveTemp = negative > 0 ? negative + 1 : 0;
        int negativeTemp = positive + 1;
        positive = positiveTemp;
        negative = negativeTemp;
      }
      maxLength = Math.max(maxLength, positive);
    }
    return maxLength;
  }
}
