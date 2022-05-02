package dynamic;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumber {
  // 264. 丑数 II
  // 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
  //
  // 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
  public long nthUglyNumber(int n) {
    int[] factors = new int[] {2, 3, 5};
    Set<Long> set = new HashSet<>();
    PriorityQueue<Long> queue = new PriorityQueue<>();
    set.add(1L);
    queue.offer(1L);
    long ugly = 1;
    for (int i = 0; i < n; i++) {
      long poll = queue.poll();
      ugly = poll;
      for (int factor : factors) {
        long value = factor * ugly;
        if (set.add(value)) {
          queue.offer(value);
        }
      }
    }

    return ugly;
  }
  // 为什么这个int不溢出
  public int nthUglyNumber2(int n) {
    int[] dp = new int[n + 1];
    dp[1] = 1;
    int dp2 = 1;
    int dp3 = 1;
    int dp5 = 1;
    for (int i = 2; i <= n; i++) {
      int num2 = dp[dp2] * 2;
      int num3 = dp[dp3] * 3;
      int num5 = dp[dp5] * 5;
      dp[i] = Math.min(num2, Math.min(num3, num5));
      if (dp[i] == num2) {
        dp2++;
      }
      if (dp[i] == num3) {
        dp3++;
      }
      if (dp[i] == num5) {
        dp5++;
      }
    }

    return dp[n];
  }
}
