package tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNumberSum {
  // 129. 求根节点到叶节点数字之和-递归
  public static int sumNumbers(TreeNode root) {
    int sum = 0;
    sum = sumNumbers(root, sum);
    return sum;
  }

  public static int sumNumbers(TreeNode root, int sum) {
    if (root == null) {
      return 0;
    }
    sum = sum * 10 + root.val;
    if (root.left == null && root.right == null) {

      return sum;
    }
    return sumNumbers(root.left, sum) + sumNumbers(root.right, sum);
  }
  //// 129. 求根节点到叶节点数字之和 - 广度优先-遍历
  public static int sumNumbers2(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    Queue<Integer> queueNum = new LinkedList<>();
    int sum = 0;
    queue.offer(root);
    queueNum.offer(root.val);
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        Integer num = queueNum.poll();
        if (poll.left == null && poll.right == null) {
          sum += num;
        }
        if (poll.left != null) {
          queue.offer(poll.left);
          queueNum.offer(num * 10 + poll.left.val);
        }
        if (poll.right != null) {
          queue.offer(poll.right);
          queueNum.offer(num * 10 + poll.right.val);
        }
      }
    }

    return sum;
  }
}
