package dynamic;

public class Trap {
  // 42. 接雨水
  // 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
  public int trap(int[] height) {
    int sum = 0;
    int[] leftMax = new int[height.length];
    leftMax[0] = height[0];
    for (int i = 1; i < height.length; i++) {
      leftMax[i] = Math.max(leftMax[i - 1], height[i]);
    }
    int[] rightMax = new int[height.length];
    rightMax[height.length - 1] = height[height.length - 1];
    for (int length = height.length - 2; length >= 0; length--) {
      rightMax[length] = Math.max(rightMax[length + 1], height[length]);
    }
    for (int i = 0; i < height.length; i++) {
      sum += Math.min(leftMax[i], rightMax[i]) - height[i];
    }
    return sum;
  }

  public int trap2(int[] height) {
    int sum = 0;
    int left = 0;
    int right = height.length - 1;
    int leftMax = 0, rightMax = 0;
    while (left < right) {
      leftMax = Math.max(leftMax, height[left]);
      rightMax = Math.max(rightMax, height[right]);
      if (height[left] > height[right]) {
        sum += leftMax - height[left];
        left++;
      } else {
        sum += rightMax - height[right];
        right++;
      }
    }
    return sum;
  }
}
