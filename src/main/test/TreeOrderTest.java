import org.junit.jupiter.api.Test;

import java.util.List;

public class TreeOrderTest {
  @Test
  public void testZigzagLevelOrder() {
    TreeNode root =
        new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
    List<List<Integer>> lists = TreeOrder.zigzagLevelOrder(root);
    System.out.println(lists);
  }
}
