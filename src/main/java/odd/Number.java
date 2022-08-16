package odd;

import java.util.*;

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

  // 1502. 判断能否形成等差数列
  // 给你一个数字数组 arr 。
  //
  // 如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。
  //
  // 如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
  public boolean canMakeArithmeticProgression(int[] arr) {
    if (arr == null || arr.length == 0) {
      return false;
    }
    int length = arr.length;
    if (length == 1 || length == 2) {
      return true;
    }
    Arrays.sort(arr);
    int n = arr[0] - arr[1];
    for (int i = 1; i < length - 1; i++) {
      if ((arr[i] - arr[i + 1]) != n) {
        return false;
      }
    }

    return true;
  }
  // 202. 快乐数
  // 编写一个算法来判断一个数 n 是不是快乐数。
  //
  // 「快乐数」 定义为：
  //
  // 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
  // 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
  // 如果这个过程 结果为 1，那么这个数就是快乐数。
  // 如果 n 是 快乐数 就返回 true ；不是，则返回 false
  public static boolean isHappy(int n) {
    Set<Integer> set = new HashSet<Integer>();
    if (n == 0) {
      return false;
    }
    while (n != 1 && !set.contains(n)) {
      set.add(n);
      n = bitSquareSum(n);
    }
    return n == 1;
  }
  // 是不是快乐数 使用快慢指针
  public static boolean isHappy2(int n) {
    if (n == 0) {
      return false;
    }
    int fast = n;
    int slow = n;
    do {
      slow = bitSquareSum(slow);
      fast = bitSquareSum(fast);
      fast = bitSquareSum(fast);
    } while (slow != 1 && slow != fast);
    return slow == 1;
  }

  public static int bitSquareSum(int n) {
    if (n == 0) {
      return 0;
    }
    int sum = 0;
    while (n != 0) {
      int bit = n % 10;
      sum = sum + bit * bit;
      n /= 10;
    }
    return sum;
  }
  // 496. 下一个更大元素 I
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] ans = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      int index = -1;
      for (int j = 0; j < nums2.length; j++) {
        if (nums1[i] == nums2[j]) {
          int k = j + 1;
          while (nums2.length > k) {
            if (nums2[k] > nums2[j]) {
              index = nums2[k];
              break;
            }
            k++;
          }
        }
      }
      ans[i] = index;
    }
    return ans;
  }

  // 496. 下一个更大元素 I
  public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
    int[] ans = new int[nums1.length];
    Map<Integer, Integer> m = new HashMap<>();
    Stack<Integer> stack = new Stack<>();
    for (int length = nums2.length - 1; length >= 0; length--) {
      while (!stack.isEmpty() && nums2[length] > stack.peek()) {
        stack.pop();
      }
      m.put(nums2[length], stack.isEmpty() ? -1 : stack.peek());
      stack.push(nums2[length]);
    }
    for (int i = 0; i < nums1.length; i++) {
      ans[i] = m.get(nums1[i]);
    }
    return ans;
  }

    /**
     * 1480. 一维数组的动态和
     *
     * @param nums 数组
     * @return 动态和
     */
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }

    /**
     * 724. 寻找数组的中心下标 给你一个整数数组 nums ，请计算数组的 中心下标 。
     *
     * <p>数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
     *
     * <p>如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
     *
     * <p>如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1
     *
     * @param nums 数组
     * @return 中心下标
     */
    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (total == nums[i] + 2 * sum) {
                return i;
            }
            sum += nums[i];
        }

        return -1;
    }
}
