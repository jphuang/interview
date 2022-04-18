import org.junit.jupiter.api.Test;

public class TreeDepthTest {
  @Test
  public void testMinDepth2() {
    TreeNode root =
        new TreeNode(
            1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, new TreeNode(5)));
    int depth = TreeDepth.minDepth2(root);
    assert depth == 3;
  }

  @Test
  public void testMinDepth() {
    TreeNode root =
        new TreeNode(
            2,
            null,
            new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6)))));
    int depth = TreeDepth.minDepth(root);
    assert depth == 5;
  }
}
