package character;

public class Alternately {
  // 1768. 交替合并字符串
  // 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
  public String mergeAlternately(String word1, String word2) {
    if (word1 == null) {
      return word2;
    }
    if (word2 == null) {
      return word1;
    }
    char[] chars = word1.toCharArray();
    char[] chars2 = word2.toCharArray();
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < chars.length + chars2.length; i++) {
      if (i > word1.length() - 1) {
        sb.append(word2.substring(i));
        break;
      }
      if (i > word2.length() - 1) {
        sb.append(word1.substring(i));
        break;
      }
      sb.append(chars[i]);
      sb.append(chars2[i]);
    }
    return sb.toString();
  }
  // 389. 找不同
  // 给定两个字符串 s 和 t ，它们只包含小写字母。
  //
  // 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
  //
  // 请找出在 t 中被添加的字母。
  public char findTheDifference(String s, String t) {
    int ans = 0;
    int rs = 0;
    for (char c : s.toCharArray()) {
      ans += c;
    }
    for (char c : t.toCharArray()) {
      rs += c;
    }
    return (char) (rs - ans);
  }
}
