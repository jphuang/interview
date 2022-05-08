package binary;

public class Search {
  // 704. 二分查找
  // 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
  public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = (right - left) / 2 + left;
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
  // 34. 在排序数组中查找元素的第一个和最后一个位置
  // 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
  //
  // 如果数组中不存在目标值 target，返回 [-1, -1]。
  //
  public int[] searchRange(int[] nums, int target) {
    int leftIdx = binarySearch(nums, target, true);
    int rightIdx = binarySearch(nums, target, false) - 1;
    if (leftIdx <= rightIdx
        && rightIdx < nums.length
        && nums[leftIdx] == target
        && nums[rightIdx] == target) {
      return new int[] {leftIdx, rightIdx};
    }
    return new int[] {-1, -1};
  }

  public int binarySearch(int[] nums, int target, boolean lower) {
    int left = 0, right = nums.length - 1, ans = -1;
    while (left <= right) {
      int mid = (left + right) / 2;
      if (nums[mid] > target || (lower && nums[mid] >= target)) {
        right = mid - 1;
        ans = mid;
      } else {
        left = mid + 1;
      }
    }
    return ans;
  }
}
