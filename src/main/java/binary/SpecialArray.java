package binary;

import java.util.Arrays;

/**
 * @author huangjiangping
 */
public class SpecialArray {
  /**
   * // 1608. 特殊数组的特征值 // 给你一个非负整数数组 nums 。如果存在一个数 x ，使得 nums 中恰好有 x 个元素 大于或者等于 x ，那么就称 nums 是一个
   * 特殊数组 ，而 x 是该数组的 特征值 。 // // 注意： x 不必 是 nums 的中的元素。 // //如果数组 nums 是一个 特殊数组 ，请返回它的特征值 x 。否则，返回
   * -1 。可以证明的是，如果 nums 是特殊数组，那么其特征值 x 是 唯一的
   *
   * @param nums 非负整数数组 nums
   * @return 特征值 x
   */
  public int specialArray(int[] nums) {
    Arrays.sort(nums);
    int length = nums.length;
    for (int i = length; i > 0; i--) {
      if (i == binarySearch(i, nums)) {
        return i;
      }
    }
    return -1;
  }

  public int binarySearch(int x, int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    if (arr[high] < x) {
      return -1;
    }
    while (low < high) {
      int mid = (low + high) / 2;
      if (arr[mid] < x) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return arr.length - high;
  }
}
