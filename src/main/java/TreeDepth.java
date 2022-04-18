import java.util.LinkedList;
import java.util.Queue;

public class TreeDepth {
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }

  public static int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }
    if (root.left == null) {
      return 1 + minDepth(root.right);
    }
    if (root.right == null) {
      return 1 + minDepth(root.left);
    }
    return 1 + Math.min(minDepth(root.right), minDepth(root.left));
  }

  public static int minDepth2(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Queue<TreeNode> stack = new LinkedList<>();
    stack.offer(root);
    int depth = 1;
    while (!stack.isEmpty()) {
      int size = stack.size();
      for (int i = 0; i < size; i++) {
        TreeNode pop = stack.poll();
        if (pop.left == null && pop.right == null) {
          return depth;
        }
        if (pop.left != null) {
          stack.offer(pop.left);
        }
        if (pop.right != null) {
          stack.offer(pop.right);
        }
      }
      // 这里增加步数
      depth++;
    }
    return depth;
  }
}
