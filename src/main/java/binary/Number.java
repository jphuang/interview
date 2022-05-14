package binary;

import java.util.Arrays;

public class Number extends GuessGame {
  // 374. 猜数字大小
  // 猜数字游戏的规则如下：
  //
  // 每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
  // 如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
  // 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）：
  //
  // -1：我选出的数字比你猜的数字小 pick < num
  // 1：我选出的数字比你猜的数字大 pick > num
  // 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
  // 返回我选出的数字。
  public int guessNumber(int n) {
    int left = 1;
    int right = n;
    while (left <= right) {
      int mid = (right - left) / 2 + left;
      int guess = guess(mid);
      if (guess == 0) {
        return mid;
      }
      if (guess > 0) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public Number(int n) {
    super(n);
  }
  // 1346. 检查整数及其两倍数是否存在
  // 给你一个整数数组 arr，请你检查是否存在两个整数 N 和 M，满足 N 是 M 的两倍（即，N = 2 * M）。
  public boolean checkIfExist(int[] arr) {
    Arrays.sort(arr);
    int length = arr.length;
    for (int i = 0; i < length; i++) {
      int index = search(arr, arr[i] * 2);
      if (index != -1 && index != i) {
        return true;
      }
    }
    return false;
  }

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
}
