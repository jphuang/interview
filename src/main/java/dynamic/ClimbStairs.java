package dynamic;

public class ClimbStairs {

  // 70. 爬楼梯
  // 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
  // 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
  public int climbStairs(int n) {

    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 2;
    }
    int f = 0;
    int q = 1;
    int p = 2;
    for (int i = 3; i <= n; i++) {
      f = q + p;
      q = p;
      p = f;
    }
    return f;
  }
  // 746. 使用最小花费爬楼梯
  // 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。
  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int[] dp = new int[n + 1];
    dp[0] = dp[1] = 0;
    for (int i = 2; i <= n; i++) {
      dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
    }
    return dp[n];
  }

  public int minCostClimbingStairs2(int[] cost) {
    int n = cost.length;
    int curr = 0;
    int pre = 0;
    for (int i = 2; i <= n; i++) {
      int next = Math.min(pre + cost[i - 1], curr + cost[i - 2]);
      pre = curr;
      curr = next;
    }
    return curr;
  }
}
