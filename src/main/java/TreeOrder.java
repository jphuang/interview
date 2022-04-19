import java.util.*;

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
  // 103. 二叉树的锯齿形层序遍历
  public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> levels = new LinkedList<>();
    if (root == null) {
      return levels;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean isOrderLeft = true;
    while (!queue.isEmpty()) {
      Deque<Integer> level = new LinkedList<>();
      int size = queue.size();
      // size不能写在fori里面
      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        if (isOrderLeft) {
          level.addLast(poll.val);
        } else {
          level.addFirst(poll.val);
        }
        if (poll.left != null) {
          queue.offer(poll.left);
        }
        if (poll.right != null) {
          queue.offer(poll.right);
        }
      }
      levels.add(new LinkedList<>(level));
      isOrderLeft = !isOrderLeft;
    }
    return levels;
  }
  // 107. 二叉树的层序遍历 II
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    LinkedList<List<Integer>> levels = new LinkedList<>();
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
      levels.addFirst(level);
    }
    return levels;
  }
}
