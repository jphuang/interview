package dynamic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class YanghuiTriangle {
  // 118. 杨辉三角
  // 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
  //
  // 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> ans = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> list = new LinkedList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          list.add(1);
          continue;
        }
        // 上一行的两个数
        list.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
      }
      ans.add(list);
    }
    return ans;
  }
  // 119. 杨辉三角 II
  // 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
  //
  // 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
  public List<Integer> getRow(int rowIndex) {
    List<Integer> pre = new LinkedList<>();
    for (int i = 0; i <= rowIndex; i++) {
      List<Integer> list = new LinkedList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          list.add(1);
          continue;
        }
        // 上一行的两个数
        list.add(pre.get(j - 1) + pre.get(j));
      }
      pre = list;
    }
    return pre;
  }

  public List<Integer> getRow2(int rowIndex) {
    List<Integer> pre = new LinkedList<>();
    pre.add(1);
    for (int i = 1; i <= rowIndex; i++) {
      for (int j = i; j > 0; j--) {
        // 上一行的两个数
        pre.add(0);
        pre.set(j, pre.get(j - 1) + pre.get(j));
      }
    }
    return pre;
  }
}
