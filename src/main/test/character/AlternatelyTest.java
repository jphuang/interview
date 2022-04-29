package character;

import org.junit.jupiter.api.Test;

public class AlternatelyTest {
  @Test
  public void testMergeAlternately() {
    Alternately alternately = new Alternately();
    String s = alternately.mergeAlternately("ab", "pqrs");
    assert s.equals("apbqrs");
  }
}
