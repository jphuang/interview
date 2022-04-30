package dynamic;

public class Profit {
  // 121. 买卖股票的最佳时机
  // 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
  //
  // 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
  //
  // 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
  public int maxProfit(int[] prices) {
    int minPrice = prices[0];
    int max = 0;
    for (int i = 1; i < prices.length; i++) {
      if (minPrice > prices[i]) {
        minPrice = prices[i];
      } else {
        max = Math.max(max, prices[i] - minPrice);
      }
    }
    return max;
  }

  // 122. 买卖股票的最佳时机 II
  // 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第 i 天的价格。
  // 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。你也可以先购买，然后在 同一天 出售。
  // 返回 你能获得的 最大 利润
  public int maxProfit2(int[] prices) {
    int max = 0;
    for (int i = 1; i < prices.length; i++) {
      max += Math.max(0, prices[i] - prices[i - 1]);
    }
    return max;
  }

  public int maxProfit3(int[] prices) {
    int max = 0;
    int dp0 = 0;
    int dp1 = -prices[0];
    for (int i = 1; i < prices.length; i++) {
      int tempDp0 = Math.max(dp0, dp1 + prices[i]);
      int tempDp1 = Math.max(dp1, dp0 - prices[i]);
      dp0 = tempDp0;
      dp1 = tempDp1;
    }
    return max;
  }
  // 309. 最佳买卖股票时机含冷冻期
  // 给定一个整数数组prices，其中第  prices[i] 表示第 i 天的股票价格 。​
  //
  // 设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
  //
  // 卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
  // 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
  public int maxProfitByFreezing(int[] prices) {
    int max = 0;
    return max;
  }
}
