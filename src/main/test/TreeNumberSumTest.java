import org.junit.jupiter.api.Test;
import tree.TreeNode;
import tree.TreeNumberSum;

public class TreeNumberSumTest {

  @Test
  public void testTreeNumberSum() {
    TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    int sum = TreeNumberSum.sumNumbers(root);
    System.out.println(sum);
    assert sum == 12 + 13;
  }

  @Test
  public void testTreeNumberSum2() {
    TreeNode root = new TreeNode(1, new TreeNode(0), null);
    int sum = TreeNumberSum.sumNumbers(root);
    System.out.println(sum);
    assert sum == 10;
  }

  @Test
  public void testTreeNumberSum3() {
    TreeNode root = new TreeNode(1, new TreeNode(0), null);
    int sum = TreeNumberSum.sumNumbers2(root);
    System.out.println(sum);
    assert sum == 10;
  }
}
