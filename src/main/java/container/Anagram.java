package container;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
  // 242. 有效的字母异位词
  // 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
  // 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    char[] chars = s.toCharArray();
    char[] chars1 = t.toCharArray();
    Arrays.sort(chars);
    Arrays.sort(chars1);
    return Arrays.equals(chars, chars1);
  }

  public boolean isAnagram2(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    Map<Character, Integer> map = new HashMap<>();
    char[] chars = s.toCharArray();
    char[] chars1 = t.toCharArray();
    for (char c : chars) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (char c : chars1) {
      map.put(c, map.getOrDefault(c, 0) - 1);
      if (map.get(c) < 0) {
        return false;
      }
    }
    return true;
  }
}
