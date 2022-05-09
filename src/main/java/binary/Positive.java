package binary;

/**
 * @author huangjiangping
 */
public class Positive {
  // 1539. 第 k 个缺失的正整数
  // 给你一个 严格升序排列 的正整数数组 arr 和一个整数 k 。
  //
  // 请你找到这个数组里第 k 个缺失的正整数。
  public int findKthPositive(int[] arr, int k) {
    if (arr[0] > k) {
      return k;
    }
    int left = 0;
    int right = arr.length;
    while (left < right) {
      int mid = (right - left) / 2 + left;
      int x = mid < arr.length ? arr[mid] : Integer.MAX_VALUE;
      if (x - mid - 1 < k) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return k - (arr[left - 1] - (left - 1) - 1) + arr[left - 1];
  }
}
