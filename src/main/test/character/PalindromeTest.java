package character;

import org.junit.jupiter.api.Test;

public class PalindromeTest {
  @Test
  public void testLongestPalindrome() {
    String palindrome = Palindrome.longestPalindrome("babad");
    System.out.println(palindrome);
    assert palindrome.equals("bab");
  }
}
