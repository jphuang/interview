package structure;

/**
 * @author Administrator
 */
public class Number {
  // 136. 只出现一次的数字
  public int singleNumber(int[] nums) {
    int ans = 0;
    for (int num : nums) {
      ans ^= num;
    }
    return ans;
  }
}
