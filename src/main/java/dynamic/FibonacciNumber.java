package dynamic;

public class FibonacciNumber {
  public static int fib(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    int[] f = new int[n + 1];
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i <= n; i++) {
      f[i] = f[i - 1] + f[i - 2];
    }
    return f[n];
  }

  public static int fib2(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fib(n - 1) + fib(n - 2);
  }

  public static int fib3(int n) {
    if (n < 1) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    int[] f = new int[n + 1];
    f[0] = 0;
    f[1] = 1;
    return fib(n - 1) + fib(n - 2);
  }

  public static int fib3Helper(int n, int[] f) {
    if (n == 1 || n == 2) {
      return 1;
    }
    if (f[n] != 0) {
      return f[n];
    }
    f[n] = fib3Helper(n - 1, f) + fib3Helper(n - 2, f);
    return f[n];
  }

  public int tribonacci(int n) {
    if (n <= 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    int[] f = new int[n + 1];
    f[0] = 0;
    f[1] = 1;
    f[2] = 1;
    for (int i = 3; i <= n; i++) {
      f[i] = f[i - 1] + f[i - 2] + f[i - 3];
    }
    return f[n];
  }
  // 91. 解码方法
  // 一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
  //
  // 'A' -> "1"
  // 'B' -> "2"
  // ...
  // 'Z' -> "26"
  // 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。例如，"11106" 可以映射为：
  //
  // "AAJF" ，将消息分组为 (1 1 10 6)
  // "KJF" ，将消息分组为 (11 10 6)
  // 注意，消息不能分组为  (1 11 06) ，因为 "06" 不能映射为 "F" ，这是由于 "6" 和 "06" 在映射中并不等价。
  //
  // 给你一个只含数字的 非空 字符串 s ，请计算并返回 解码 方法的 总数 。
  //
  // 题目数据保证答案肯定是一个 32 位 的整数。
  public int numDecodings(String s) {
    if (s == null) {
      return 0;
    }
    int n = s.length();
    if (n == 0) {
      return 0;
    }
    int[] f = new int[n + 1];
    f[0] = 1;
    char[] chars = s.toCharArray();
    for (int i = 1; i <= n; i++) {
      if (chars[i - 1] != '0') {
        f[i] += f[i - 1];
      }
      if (i > 1
          && chars[i - 2] != '0'
          && ((chars[i - 2] - '0') * 10 + (chars[i - 1] - '0')) <= 26) {
        f[i] += f[i - 2];
      }
    }
    return f[n];
  }
}
