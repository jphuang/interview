package dynamic;

import org.junit.jupiter.api.Test;

public class JumpTest {
  @Test
  public void testCanJump() {
    Jump jump = new Jump();
    boolean b = jump.canJump(new int[] {2, 3, 1, 1, 4});
    assert b;
  }
}
