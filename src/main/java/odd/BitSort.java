package odd;

import java.util.ArrayList;
import java.util.List;

public class BitSort {
  // 1356. 根据数字二进制下 1 的数目排序
  // 给你一个整数数组 arr 。请你将数组中的元素按照其二进制表示中数字 1 的数目升序排序。
  // 如果存在多个数字二进制中 1 的数目相同，则必须将它们按照数值大小升序排列。
  // 请你返回排序后的数组。
  public int[] sortByBits(int[] arr) {
    int[] bitAll = new int[10001];
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      bitAll[i] = getBits(i);
      list.add(i);
    }
    list.sort(
        (i, j) -> {
          if (bitAll[i] != bitAll[j]) {
            return bitAll[i] - bitAll[j];
          } else {
            return i - j;
          }
        });
    for (int i = 0; i < list.size(); i++) {
      arr[i] = list.get(i);
    }
    return arr;
  }

  public int getBits(int x) {
    int sumBit = 0;
    while (x != 0) {
      sumBit += x % 2;
      x /= 2;
    }
    return sumBit;
  }
}
