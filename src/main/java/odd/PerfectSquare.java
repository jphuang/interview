package odd;

public class PerfectSquare {
  // 367. 有效的完全平方数
  // 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
  //
  // 进阶：不要 使用任何内置的库函数，如  sqrt 。
  public boolean isPerfectSquare(int num) {
    int sqrt = (int) Math.sqrt(num);
    return sqrt * sqrt == num;
  }

  public boolean isPerfectSquare2(int num) {
    int x = 1;
    int sqrt = 1;
    while (sqrt <= num) {
      if (sqrt == num) {
        return true;
      }
      x++;
      sqrt = x * x;
    }
    return false;
  }

  public boolean isPerfectSquare3(int num) {
    int left = 1;
    int right = num;
    while (left <= right) {
      int mid = (right - left) / 2 + left;
      long x = (long) mid * mid;
      if (x == num) {
        return true;
      }
      if (x < num) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return false;
  }
}
