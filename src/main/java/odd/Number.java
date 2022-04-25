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
  // 1822. 数组元素积的符号
  // 已知函数 signFunc(x) 将会根据 x 的正负返回特定值：
  //
  // 如果 x 是正数，返回 1 。
  // 如果 x 是负数，返回 -1 。
  // 如果 x 是等于 0 ，返回 0 。
  // 给你一个整数数组 nums 。令 product 为数组 nums 中所有元素值的乘积。
  //
  // 返回 signFunc(product) 。
  //
  public int arraySign(int[] nums) {
    int ret = 1;
    for (int num : nums) {
      if (num == 0) {
        return 0;
      }
      if (num < 0) {
        ret *= -1;
      }
    }
    return ret;
  }
}
