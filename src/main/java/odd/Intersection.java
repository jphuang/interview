package odd;

import java.util.Arrays;

public class Intersection {
  // 350. 两个数组的交集 II
  // 给你两个整数数组 nums1 和 nums2
  // ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序
  public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int length1 = nums1.length;
    int length2 = nums2.length;
    int intersect[] = new int[Math.min(length1, length2)];
    int index1 = 0;
    int index2 = 0;
    int index = 0;
    while (index1 < length1 && index2 < length2) {
      if (nums1[index1] == nums2[index2]) {
        intersect[index++] = nums1[index1];
        index1++;
        index2++;
        continue;
      }
      if (nums1[index1] < nums2[index2]) {
        index1++;
      } else {
        index2++;
      }
    }
    return Arrays.copyOfRange(intersect, 0, index + 1);
  }
}
