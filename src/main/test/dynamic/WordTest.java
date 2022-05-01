package dynamic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class WordTest {
  @Test
  public void testWordBreak() {
    Word word = new Word();
    ArrayList<String> wordDict =
        new ArrayList<String>() {
          {
            add("leet");
            add("code");
          }
        };
    boolean b = word.wordBreak("leetcode", wordDict);
    assert b;
  }
}
