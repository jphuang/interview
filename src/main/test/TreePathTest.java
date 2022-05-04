import org.junit.jupiter.api.Test;
import tree.TreeNode;
import tree.TreePath;

public class TreePathTest {
  @Test
  public void testTreePathSum() {
    TreeNode root = new TreeNode(1, new TreeNode(2), null);
    boolean b = TreePath.hasPathSum(root, 1);
    assert b;
  }

  @Test
  public void testTreePathSum2() {
    TreeNode root = new TreeNode(1, new TreeNode(2), null);
    boolean b = TreePath.hasPathSum2(root, 1);
    assert !b;
  }

  @Test
  public void testMaxPathSum() {
    TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreePath.maxPathSum(root);
    assert TreePath.maxSum == 6;
  }
}
