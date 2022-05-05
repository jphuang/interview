package tree;

import java.util.ArrayList;
import java.util.List;

public class MorrisTravel {
  public static TreeNode getPredecessor(TreeNode root) {
    TreeNode pre = root;
    if (root.left != null) {
      pre = root.left;
      while (pre.right != null && pre.right != root) {
        pre = pre.right;
      }
    }
    return pre;
  }

  public static List<Integer> morrisTravel(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    while (root != null) {
      if (root.left == null) {
        res.add(root.val);
        root = root.right;
      } else {
        TreeNode pre = getPredecessor(root);
        if (pre.right == null) {
          pre.right = root;
          root = root.left;
        }
        if (pre.right == root) {
          pre.right = null;
          res.add(root.val);
          root = root.right;
        }
      }
    }
    return res;
  }
}
