package binary;

public class MySqrt {
  // 69. x 的平方根
  // 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
  //
  // 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
  //
  // 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
  public int mySqrt(int x) {
    int num = 1;
    int sqrt = 1;
    while (sqrt <= x) {
      if (sqrt == x) {
        return num;
      }
      num++;
      sqrt = num * num;
    }
    return num - 1;
  }

  public int mySqrt2(int x) {
    int left = 1;
    int right = x;
    while (left <= right) {
      int mid = (right - left) / 2 + left;
      long num = (long) mid * mid;
      if (x == num) {
        return mid;
      }
      if (num < x) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return right;
  }
}
