public class Subtree {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) {
      return false;
    }
    return sameTree(root, subRoot)
        || isSubtree(root.left, subRoot)
        || isSubtree(root.right, subRoot);
  }

  public boolean sameTree(TreeNode root, TreeNode subRoot) {
    if (root == null && subRoot == null) {
      return true;
    }
    if (root == null || subRoot == null || root.val != subRoot.val) {
      return false;
    }
    return sameTree(root.left, subRoot.left) && sameTree(root.right, subRoot.right);
  }
}
