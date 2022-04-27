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
}
