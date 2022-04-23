package odd;

public class Number {
  public static int hammingWeight(int n) {
    int ret = 0;
    for (int i = 0; i < 32; i++) {
      if ((n & 1 << i) != 0) {
        ret++;
      }
    }
    return ret;
  }

  public int hammingWeight2(int n) {
    int ret = 0;
    while (n != 0) {
      n &= (n - 1);
      ret++;
    }
    return ret;
  }

  // 1281. 整数的各位积和之差
  // 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
  public int subtractProductAndSum(int n) {
    int sum = 0;
    int mul = 1;
    while (n != 0) {
      sum += n % 10;
      mul *= n % 10;
      n = n / 10;
    }
    return mul - sum;
  }
}
