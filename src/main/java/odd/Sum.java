package odd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author huangjiangping
 */
public class Sum {
  /**
   * * 15. 三数之和 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
   *
   * <p>注意：答案中不可以包含重复的三元组。
   *
   * @param nums 整数的数组
   * @return 三元组
   */
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> sumList = new ArrayList<>();
    Arrays.sort(nums);
    int length = nums.length;
    for (int i = 0; i < length; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      int target = -nums[i];
      int three = length - 1;
      for (int second = i + 1; second < length; second++) {
        if (second > i + 1 && nums[second] == nums[second - 1]) {
          continue;
        }
        while (second < three && nums[second] + nums[three] > target) {
          three--;
        }
        if (second == three) {
          break;
        }
        if (nums[second] + nums[three] == target) {
          List<Integer> list = new ArrayList<>();
          list.add(nums[i]);
          list.add(nums[second]);
          list.add(nums[three]);
          sumList.add(list);
        }
      }
    }
    return sumList;
  }

  public static List<List<Integer>> towSum(int[] nums, int value, int start, int end) {
    List<List<Integer>> sumList = new ArrayList<>();
    while (start < end) {
      if (nums[start] == nums[start + 1]) {
        start++;
        continue;
      }
      if (nums[end] == nums[end - 1]) {
        end--;
        continue;
      }
      int s = nums[start] + nums[end] + value;
      if (s == 0) {}
    }
    return sumList;
  }

  /**
   * 167. 两数之和 II - 输入有序数组 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target
   * 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
   *
   * <p>以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
   *
   * <p>你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
   *
   * <p>你所设计的解决方案必须只使用常量级的额外空间。
   *
   * @param numbers 有序数组
   * @param target 两数之和
   * @return 两个整数的下标 index1 和 index2。
   */
  public int[] twoSum(int[] numbers, int target) {
    for (int i = 0; i < numbers.length; i++) {
      int x = target - numbers[i];
      int index2 = binarySearch(x, numbers, i);
      if (x == numbers[index2]) {
        return new int[] {i + 1, index2 + 1};
      }
    }
    return new int[] {0, 0};
  }

  public int binarySearch(int x, int[] arr, int index) {
    int low = index + 1;
    int high = arr.length - 1;
    while (low < high) {
      int mid = (low + high) / 2;
      if (arr[mid] == x) {
        return mid;
      }
      if (arr[mid] < x) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}
