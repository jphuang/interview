import org.junit.jupiter.api.Test;

public class TreeSameTest {
  @Test
  public void TestIsSameTree() {
    TreeNode root =
        new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    boolean sameTree = TreeSame.isSameTree(root, root);
    assert sameTree;
  }

  @Test
  public void TestSymmetric2() {
    TreeNode root =
        new TreeNode(
            1, new TreeNode(2, new TreeNode(3), null), new TreeNode(2, null, new TreeNode(3)));
    boolean sameTree = TreeSame.isSymmetric2(root);
    assert !sameTree;
  }

  @Test
  public void TestSymmetric3() {
    TreeNode root =
        new TreeNode(
            1,
            new TreeNode(2, new TreeNode(3), new TreeNode(4)),
            new TreeNode(2, new TreeNode(4), new TreeNode(3)));
    boolean sameTree = TreeSame.isSymmetric2(root);
    assert sameTree;
  }
}
