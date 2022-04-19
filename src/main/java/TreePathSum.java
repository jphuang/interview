import java.util.LinkedList;
import java.util.Queue;

public class TreePathSum {
  public static boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    while (!q.isEmpty()) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        TreeNode poll = q.poll();
        if (poll.left == null && poll.right == null && poll.val == targetSum) {
          return true;
        }
        if (poll.left != null) {
          int value = poll.left.val + poll.val;
          poll.left.val = value;
          q.offer(poll.left);
        }
        if (poll.right != null) {
          int value = poll.right.val + poll.val;
          poll.right.val = value;
          q.offer(poll.right);
        }
      }
    }

    return false;
  }

  public static boolean hasPathSum2(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }

    if (root.left == null && root.right == null && root.val == targetSum) {
      return true;
    }

    return hasPathSum2(root.left, targetSum - root.val)
        || hasPathSum2(root.right, targetSum - root.val);
  }
}
