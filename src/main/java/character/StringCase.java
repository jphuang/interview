package character;

public class StringCase {
  // 709. 转换成小写字母
  // 给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。
  public String toLowerCase(String s) {
    if (s == null) {
      return null;
    }
    return s.toLowerCase();
  }

  public String toLowerCase2(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] >= 65 && chars[i] <= 90) {
        chars[i] += 32;
      }
    }
    return new String(chars);
  }

  public String toLowerCase3(String s) {
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] >= 65 && chars[i] <= 90) {
        chars[i] |= 32;
      }
    }
    return new String(chars);
  }
}
