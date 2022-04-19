import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Traversal {
  public static List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    inorder(root, res);
    return res;
  }

  public static void inorder(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    inorder(root.left, res);
    res.add(root.val);
    inorder(root.right, res);
  }
  // 144. 二叉树的前序遍历 --递归
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    preorder(root, res);
    return res;
  }
  // 144. 二叉树的前序遍历 --递归
  public static void preorder(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    res.add(root.val);
    preorder(root.left, res);
    preorder(root.right, res);
  }
  // 144. 二叉树的后序遍历 --递归
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    postorder(root, res);
    return res;
  }

  public static void postorder(TreeNode root, List<Integer> res) {
    if (root == null) {
      return;
    }
    postorder(root.left, res);
    postorder(root.right, res);
    res.add(root.val);
  }

  public static List<Integer> inorderTraversalByDeque(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      res.add(root.val);
      root = root.right;
    }

    return res;
  }
}
