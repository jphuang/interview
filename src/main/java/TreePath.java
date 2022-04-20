import java.util.*;

public class TreePath {
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

  public static List<List<Integer>> hasPathSumList(TreeNode root, int targetSum) {
    List<List<Integer>> list = new ArrayList<>();
    Deque<Integer> tmp = new LinkedList<>();
    hasPathSumListDSF(root, targetSum, list, tmp);
    return list;
  }

  public static void hasPathSumListDSF(
      TreeNode root, int targetSum, List<List<Integer>> list, Deque<Integer> tmp) {
    if (root == null) {
      return;
    }
    targetSum -= root.val;
    tmp.offerLast(root.val);
    if (root.left == null && root.right == null && 0 == targetSum) {
      list.add(new LinkedList<>(tmp));
    }

    hasPathSumListDSF(root.left, targetSum, list, tmp);
    hasPathSumListDSF(root.right, targetSum, list, tmp);
    tmp.pollLast();
  }

  static int maxSum = Integer.MIN_VALUE;
  // 124. 二叉树中的最大路径和
  public static int maxPathSum(TreeNode root) {
    maxPathSumHelper(root);
    return maxSum;
  }

  public static int maxPathSumHelper(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftValue = Math.max(maxPathSumHelper(root.left), 0);
    int rightValue = Math.max(maxPathSumHelper(root.right), 0);
    int newValue = root.val + leftValue + rightValue;
    maxSum = Math.max(maxSum, newValue);
    return root.val + Math.max(leftValue, rightValue);
  }

  public List<String> binaryTreePaths(TreeNode root) {
    LinkedList<String> res = new LinkedList<>();
    binaryTreePathsBSF(root, "", res);
    return res;
  }

  public void binaryTreePathsBSF(TreeNode root, String path, LinkedList<String> res) {
    if (root == null) {
      return;
    }
    path += root.val;
    if (root.left == null && root.right == null) {
      res.add(path);
      return;
    }
    path += "->";
    binaryTreePathsBSF(root.left, path, res);
    binaryTreePathsBSF(root.right, path, res);
  }
}
