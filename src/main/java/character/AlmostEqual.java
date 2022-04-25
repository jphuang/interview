package character;

public class AlmostEqual {
  // 1790. 仅执行一次字符串交换能否使两个字符串相等
  // 给你长度相等的两个字符串 s1 和 s2 。一次 字符串交换 操作的步骤如下：选出某个字符串中的两个下标（不必不同），并交换这两个下标所对应的字符。
  //
  // 如果对 其中一个字符串 执行 最多一次字符串交换 就可以使两个字符串相等，返回 true ；否则，返回 false 。
  public boolean areAlmostEqual(String s1, String s2) {
    if (s1.equals(s2)) {
      return true;
    }
    int length = s1.length();
    char[] chars = s1.toCharArray();
    char[] chars2 = s2.toCharArray();
    int diff = 0;
    int index1 = -1, index2 = -1;
    for (int i = 0; i < length; i++) {
      if (chars[i] != chars2[i]) {
        diff++;
        if (diff > 2) {
          return false;
        }
        if (diff == 1) {
          index1 = i;
        } else {
          index2 = i;
        }
      }
    }
    if (diff == 0) {
      return true;
    }
    if (diff == 1) {
      return false;
    }
    return chars[index1] == chars2[index2] && chars[index2] == chars2[index1];
  }
}
