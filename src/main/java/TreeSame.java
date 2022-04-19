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
}
