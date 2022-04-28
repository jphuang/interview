package dynamic;

public class SightseeingPair {
  // 1014. 最佳观光组合
  // 给你一个正整数数组 values，其中 values[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的 距离 为 j - i。
  // 一对景点（i < j）组成的观光组合的得分为 values[i] + values[j] + i - j ，也就是景点的评分之和 减去 它们两者之间的距离。
  // 返回一对观光景点能取得的最高分。
  public int maxScoreSightseeingPair(int[] values) {
    int maxScore = 0;
    int mx = values[0] + 0;
    for (int i = 1; i < values.length; i++) {
      maxScore = Math.max(maxScore, mx + values[i] - i);
      mx = Math.max(mx, values[i] + i);
    }
    return maxScore;
  }
}
