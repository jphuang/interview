package character;

import java.util.HashMap;
import java.util.Map;

public class Goal {
  // 1678. 设计 Goal 解析器
  // 请你设计一个可以解释字符串 command 的 Goal 解析器 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。Goal 解析器会将 "G" 解释为字符串
  // "G"、"()" 解释为字符串 "o" ，"(al)" 解释为字符串 "al" 。然后，按原顺序将经解释得到的字符串连接成一个字符串。
  // 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
  public String interpret(String command) {
    Map<String, String> map =
        new HashMap<String, String>() {
          {
            put("G", "G");
            put("()", "o");
            put("(al)", "al");
          }
        };
    StringBuffer sb = new StringBuffer();
    String temp = "";
    char[] chars = command.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      temp += chars[i];
      String s = map.get(temp);
      if (s != null) {
        sb.append(s);
        temp = "";
      }
    }
    return sb.toString();
  }
  // 1309. 解码字母到整数映射
  // 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
  //
  // 字符（'a' - 'i'）分别用（'1' - '9'）表示。
  // 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。
  // 返回映射之后形成的新字符串。
  // 题目数据保证映射始终唯一。
  public String freqAlphabets(String s) {
    StringBuffer sb = new StringBuffer();
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if (i + 2 < chars.length && chars[i + 2] == '#') {
        int i1 = (chars[i] - '0') * 10 + (chars[i + 1] - '1') + 'a';
        char j = (char) (i1);
        sb.append(j);
        i = i + 2;
      } else {
        sb.append((char) (c - '1' + 'a'));
      }
    }
    return sb.toString();
  }
  // 953. 验证外星语词典
  // 某种外星语也使用英文小写字母，但可能顺序 order 不同。字母表的顺序（order）是一些小写字母的排列。
  //
  // 给定一组用外星语书写的单词 words，以及其字母表的顺序 order，只有当给定的单词在这种外星语中按字典序排列时，返回 true；否则，返回 false。。
  public boolean isAlienSorted(String[] words, String order) {
    Map<Character, Integer> map = new HashMap<>();
    char[] chars = order.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      map.put(chars[i], i);
    }
    for (int i = 1; i < words.length; i++) {
      char[] array = words[i].toCharArray();
      char[] preArray = words[i - 1].toCharArray();
      for (int j = 0; j < preArray.length + array.length; j++) {
        if (j >= preArray.length) {
          break;
        }
        if (j >= array.length) {
          return false;
        }
        Integer preIndex = map.get(preArray[j]);
        Integer currIndex = map.get(array[j]);
        if (currIndex > preIndex) {
          break;
        }
        if (currIndex < preIndex) {
          return false;
        }
      }
    }
    return true;
  }
}
