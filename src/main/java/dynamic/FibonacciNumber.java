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
}
