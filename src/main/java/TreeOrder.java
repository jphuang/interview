import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

  public List<List<Integer>> levelOrder2(TreeNode root) {
    List<List<Integer>> levels = new ArrayList<>();
    if (root == null) {
      return levels;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      List<Integer> level = new ArrayList<>();
      int size = queue.size();
      // size不能写在fori里面
      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        level.add(poll.val);
        if (poll.left != null) {
          queue.offer(poll.left);
        }
        if (poll.right != null) {
          queue.offer(poll.right);
        }
      }
      levels.add(level);
    }

    return levels;
  }
}
