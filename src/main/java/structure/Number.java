package structure;

import java.util.Arrays;

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
  // 169. 多数元素
  // 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
  //
  // 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
  // TODO Boyer-Moore 投票算法
  public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }
}
