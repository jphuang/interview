import org.junit.jupiter.api.Test;

public class TreeSameTest {
  @Test
  public void TestIsSameTree() {
    TreeNode root =
        new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    boolean sameTree = TreeSame.isSameTree(root, root);
    assert sameTree;
  }
}
