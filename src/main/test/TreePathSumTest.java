import org.junit.jupiter.api.Test;

public class TreePathSumTest {
  @Test
  public void testTreePathSum() {
    TreeNode root = new TreeNode(1, new TreeNode(2), null);
    boolean b = TreePathSum.hasPathSum(root, 1);
    assert b;
  }

  @Test
  public void testTreePathSum2() {
    TreeNode root = new TreeNode(1, new TreeNode(2), null);
    boolean b = TreePathSum.hasPathSum2(root, 1);
    assert !b;
  }
}
