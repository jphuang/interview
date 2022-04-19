import java.util.LinkedList;
import java.util.Queue;

public class TreeSame {
  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p != null && q != null) {
      if (p.val != q.val) {
        return false;
      }
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    return false;
  }
  // 101. 对称二叉树
  public static boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return symmetric(root.left, root.right);
  }

  public static boolean symmetric(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    return p.val == q.val && symmetric(p.left, q.right) && symmetric(p.right, q.left);
  }

  // 101. 对称二叉树- 遍历
  public static boolean isSymmetric2(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (root.left == null && root.right == null) {
      return true;
    }
    Queue<TreeNode> q = new LinkedList<>();
    Queue<TreeNode> p = new LinkedList<>();

    p.offer(root.left);
    q.offer(root.right);

    while (!q.isEmpty() || !p.isEmpty()) {

      TreeNode first = p.poll();
      TreeNode last = q.poll();
      if (first == null && last == null) {
        continue;
      }
      if (first == null || last == null) {
        return false;
      }

      if (first.val != last.val) {
        return false;
      }
      p.offer(first.left);
      p.offer(first.right);

      q.offer(last.right);
      q.offer(last.left);
    }
    return true;
  }
}
