package multitree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Node {
  public int val;
  public List<Node> children;

  public Node() {}

  public Node(int _val) {
    val = _val;
  }

  public Node(int _val, List<Node> _children) {
    val = _val;
    children = _children;
  }
  // 589. N 叉树的前序遍历 --递归
  public List<Integer> preorder(Node root) {
    List<Integer> res = new ArrayList<>();
    preorder(root, res);
    return res;
  }

  public void preorder(Node root, List<Integer> res) {
    if (root == null) {
      return;
    }
    res.add(root.val);
    if (root.children != null) {
      for (Node child : root.children) {
        preorder(child, res);
      }
    }
  }

  // 144. N 叉树的前序遍历 --迭代
  public List<Integer> preorderTraversal2(Node root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) {
      return res;
    }
    Stack<Node> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      Node pop = stack.pop();
      res.add(pop.val);
      if (pop.children != null) {
        int size = root.children.size();
        for (int i = size - 1; i >= 0; i--) {
          stack.push(pop.children.get(i));
        }
      }
    }
    return res;
  }
}
