package array;

import java.util.HashMap;
import java.util.Map;

/** @author jphuang */
public class Number {
    /**
     * 剑指 Offer 03. 数组中重复的数字 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1
     * 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
     *
     * @param nums 数组
     * @return 重复的数字
     */
    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> repeatNumbers = new HashMap<>(nums.length);
        for (int num : nums) {
            if (repeatNumbers.get(num) != null) {
                return num;
            }
            repeatNumbers.put(num, num);
        }
        return 0;
    }

    public int findRepeatNumber2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == i) {
                continue;
            }
            if (nums[i] == nums[num]) {
                return nums[i];
            }
            while (nums[i] != i) {
                if (nums[i] == nums[num]) {
                    return nums[i];
                }
                nums[i] = nums[num];
                nums[num] = num;
                num = nums[i];
            }
        }
        return 0;
    }
}
