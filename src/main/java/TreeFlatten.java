import java.util.Stack;

public class TreeFlatten {
  public void flatten(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    TreeNode pre = null;
    while (!stack.isEmpty()) {
      TreeNode curr = stack.pop();
      if (pre != null) {
        pre.left = null;
        pre.right = curr;
      }
      if (curr.right != null) {
        stack.push(curr.right);
      }
      if (curr.left != null) {
        stack.push(curr.left);
      }
      pre = curr;
    }
  }
}
