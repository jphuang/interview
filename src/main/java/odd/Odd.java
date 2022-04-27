package odd;

public class Odd {
  // 1523. 在区间范围内统计奇数数目
  // 给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。
  public int countOdds(int low, int high) {
    if (low % 2 == 1) {
      low--;
    }
    if (high % 2 == 1) {
      high++;
    }
    return (high - low) >> 1;
  }
  // 1491. 去掉最低工资和最高工资后的工资平均值
  // 给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
  //
  // 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
  public double average(int[] salary) {
    int max = salary[0];
    int min = salary[0];
    double sum = salary[0];
    for (int i = 1; i < salary.length; i++) {
      if (salary[i] < min) {
        min = salary[i];
      }
      if (salary[i] > max) {
        max = salary[i];
      }
      sum += salary[i];
    }
    return (sum - min - max) / (salary.length - 2);
  }
  // 283. 移动零
  // 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
  //
  // 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
  public void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        if (j == 0) {
          j = i + 1;
        }
        if (j >= nums.length) {
          break;
        }
        for (; j < nums.length; j++) {
          if (nums[j] != 0) {
            nums[i] = nums[j];
            nums[j] = 0;
            break;
          }
        }
      }
    }
  }

  public void moveZeroes2(int[] nums) {
    int index = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != 0 && i != index) {
        nums[index++] = nums[i];
      }
    }
    for (int i = index; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
