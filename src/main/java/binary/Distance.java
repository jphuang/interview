package binary;

import java.util.Arrays;

public class Distance {
  // 1385. 两个数组间的距离值
  // 给你两个整数数组 arr1 ， arr2 和一个整数 d ，请你返回两个数组之间的 距离值 。
  //
  // 「距离值」 定义为符合此距离要求的元素数目：对于元素 arr1[i] ，不存在任何元素 arr2[j] 满足 |arr1[i]-arr2[j]| <= d 。
  //
  public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    Arrays.sort(arr2);
    int cnt = 0;
    for (int i : arr1) {
      int p = binarySearch(i, arr2);
      boolean ok = true;
      if (p < arr2.length) {
        ok &= arr2[p] - i > d;
      }
      if (p - 1 >= 0 && p - 1 <= arr2.length) {
        ok &= i - arr2[p - 1] > d;
      }
      cnt += ok ? 1 : 0;
    }
    return cnt;
  }

  public int binarySearch(int x, int[] arr) {
    int low = 0;
    int high = arr.length - 1;
    if (arr[high] < x) {
      return high + 1;
    }
    while (low < high) {
      int mid = (low + high) / 2;
      if (arr[mid] < x) {
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
}
