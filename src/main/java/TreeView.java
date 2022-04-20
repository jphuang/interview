import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeView {
  public List<Integer> rightSideView(TreeNode root) {
    LinkedList<Integer> res = new LinkedList<>();
    if (root == null) {
      return res;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        if (i == 0) {
          res.add(poll.val);
        }
        if (poll.right != null) {
          queue.offer(poll.right);
        }
        if (poll.left != null) {
          queue.offer(poll.left);
        }
      }
    }
    return res;
  }

  public List<Integer> rightSideView2(TreeNode root) {
    LinkedList<Integer> res = new LinkedList<>();
    if (root == null) {
      return res;
    }
    rightSideViewDSF(root, res, 0);
    return res;
  }

  public void rightSideViewDSF(TreeNode root, LinkedList<Integer> res, int depth) {
    if (root == null) {
      return;
    }
    if (depth == res.size()) {
      res.add(root.val);
    }
    depth++;
    rightSideViewDSF(root.right, res, depth);
    rightSideViewDSF(root.left, res, depth);
  }
}
