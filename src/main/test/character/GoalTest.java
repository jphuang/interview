package character;

import org.junit.jupiter.api.Test;

public class GoalTest {
  @Test
  public void testIsAlienSorted() {
    Goal goal = new Goal();
    boolean t =
        goal.isAlienSorted(new String[] {"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
    assert t;
  }
}
