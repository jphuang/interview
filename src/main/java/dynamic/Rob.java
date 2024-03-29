package dynamic;

public class Rob {
  // 198. 打家劫舍
  // 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
  // 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
  public static int rob(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    int first = nums[0];
    int second = Math.max(nums[0], nums[1]);
    for (int i = 2; i < nums.length; i++) {
      int temp = second;
      second = Math.max(nums[i] + first, second);
      first = temp;
    }
    return second;
  }

  public static int rob2(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    int length = nums.length;
    if (length == 1) {
      return nums[0];
    }
    if (length == 2) {
      return Math.max(nums[0], nums[1]);
    }
    return Math.max(robRange(nums, 0, length - 1), robRange(nums, 1, length));
  }

  public static int robRange(int[] nums, int start, int end) {
    int first = nums[start];
    int second = Math.max(nums[start], nums[start + 1]);
    for (int i = start + 2; i < end; i++) {
      int temp = second;
      second = Math.max(nums[i] + first, second);
      first = temp;
    }
    return second;
  }
  // 740. 删除并获得点数
  public int deleteAndEarn(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    int max = nums[0];
    for (int num : nums) {
      if (num > max) {
        max = num;
      }
    }
    int[] all = new int[max + 1];
    for (int num : nums) {
      all[num]++;
    }
    int dp[] = new int[max + 1];
    dp[1] = all[1];
    dp[2] = Math.max(dp[1], all[2] * 2);
    for (int i = 2; i <= max; ++i) {
      dp[i] = Math.max(dp[i - 1], dp[i - 2] + i * all[i]);
    }
    return dp[max];
  }
}
