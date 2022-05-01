package dynamic;

import org.junit.jupiter.api.Test;

public class TrapTest {
  @Test
  public void testTrap() {
    Trap trap = new Trap();
    int sum = trap.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    assert sum == 6;
  }
}
