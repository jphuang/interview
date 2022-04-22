package character;

public class Palindrome {
  public static String longestPalindrome(String s) {
    int length = s.length();
    String maxPalindrome = "";
    int maxLen = 0;
    char[] chars = s.toCharArray();
    boolean[][] p = new boolean[length][length];
    for (int len = 1; len <= length; len++) {
      for (int start = 0; start < length; start++) {
        int end = start + len - 1;
        if (end >= length) {
          break;
        }
        p[start][end] =
            (len == 1)
                || (len == 2 && chars[start] == chars[end])
                || (p[start + 1][end - 1] && chars[start] == chars[end]);
        if (p[start][end] && len > maxLen) {
          maxLen = len;
          maxPalindrome = s.substring(start, end + 1);
        }
      }
    }
    return maxPalindrome;
  }
}
