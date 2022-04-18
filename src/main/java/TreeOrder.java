import java.util.ArrayList;
import java.util.List;

public class TreeOrder {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> levels = new ArrayList<>();
    if (root == null) {
      return levels;
    }
    order(root, 0, levels);
    return levels;
  }

  public void order(TreeNode root, int level, List<List<Integer>> levels) {
    if (levels.size() == level) {
      levels.add(new ArrayList<>());
    }
    levels.get(level).add(root.val);
    if (root.left != null) {
      order(root.left, level + 1, levels);
    }
    if (root.right != null) {
      order(root.right, level + 1, levels);
    }
  }
}
