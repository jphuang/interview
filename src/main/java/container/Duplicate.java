package container;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
  // 217. 存在重复元素
  // 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    return set.size() < nums.length;
  }

  public boolean containsDuplicate2(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        return false;
      }
      set.add(num);
    }
    return true;
  }

  public boolean containsDuplicate3(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        return true;
      }
    }
    return false;
  }
}
