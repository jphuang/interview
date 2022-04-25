package dynamic;

public class Jump {
  // 55. 跳跃游戏
  // 给定一个非负整数数组 nums ，你最初位于数组的 第一个下标 。
  //
  // 数组中的每个元素代表你在该位置可以跳跃的最大长度。
  //
  // 判断你是否能够到达最后一个下标。

  public boolean canJump(int[] nums) {
    if (nums == null || nums.length == 0) {
      return false;
    }
    if (nums.length == 1) {
      return true;
    }
    int position = nums.length;
    int steps = 0;
    for (int i = 0; i < position; i++) {
      if (i <= steps) {
        steps = Math.max(steps, i + nums[i]);
        if (steps >= position) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean canJump2(int[] nums) {
    if (nums == null || nums.length == 0) {
      return false;
    }
    int position = nums.length - 1;
    int steps = 0;
    while (position > 0) {
      for (int i = 0; i < position; i++) {
        if (i + nums[i] >= position) {
          position = i;
          steps++;
          break;
        }
      }
    }
    return true;
  }
}
