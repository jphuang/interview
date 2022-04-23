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
}
