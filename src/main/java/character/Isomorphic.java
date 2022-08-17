package character;

import java.util.HashMap;
import java.util.Map;

/** @author jphuang */
public class Isomorphic {

    /**
     * 映射字符串
     *
     * @param s s
     * @param t t
     * @return boolean
     */
    public boolean isMapping(String s, String t) {
        if (s == null || t == null) {
            return false;
        }
        int len = s.length();
        if (t.length() != len) {
            return false;
        }
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();

        int num = chars[0] - chars1[0];
        for (int i1 = 1; i1 < chars.length; i1++) {
            int i = chars[i1] - chars1[i1];
            if (num != i) {
                return false;
            }
        }
        return true;
    }

    /**
     * 205. 同构字符串 给定两个字符串 s 和 t ，判断它们是否是同构的。
     *
     * <p>如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
     *
     * <p>每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
     *
     * @param s s
     * @param t t
     * @return boolean
     */
    public boolean isIsomorphic(String s, String t) {

        char[] chars = s.toCharArray();
        Map<Character, Character> map = new HashMap<>(chars.length);
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            char c1 = t.charAt(i);
            Character character = map.get(c);
            if (character == null) {
                if (map.containsValue(c1)) {
                    return false;
                }
                map.put(c, c1);
                continue;
            }
            if (!character.equals(c1)) {
                return false;
            }
        }
        return true;
    }
}
