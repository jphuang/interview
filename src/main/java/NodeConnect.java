import java.util.LinkedList;
import java.util.Queue;

public class NodeConnect {
  public Node connect(Node root) {
    if (root == null) {
      return null;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        Node poll = queue.poll();
        if (i < size - 1) {
          poll.next = queue.peek();
        }
        if (poll.left != null) {
          queue.offer(poll.left);
        }
        if (poll.right != null) {
          queue.offer(poll.right);
        }
      }
    }
    return root;
  }
  // 116. 填充每个节点的下一个右侧节点指针(完全树)
  public Node connect2(Node root) {
    if (root == null) {
      return null;
    }
    Node leftMost = root;
    while (leftMost.left != null) {
      Node head = leftMost;
      while (head != null) {
        head.left.next = head.right;
        if (head.next != null) {
          head.right.next = head.next.left;
        }
        head = head.next;
      }
      leftMost = leftMost.left;
    }
    return root;
  }

  // 117. 填充每个节点的下一个右侧节点指针 II
  public Node connect3(Node root) {
    if (root == null) {
      return null;
    }
    Node curr = root;
    while (curr != null) {
      Node head = new Node(0);
      Node pre = head;
      while (curr != null) {
        if (curr.left != null) {
          pre.next = curr.left;
          pre = pre.next;
        }
        if (curr.right != null) {
          pre.next = curr.right;
          pre = pre.next;
        }
        curr = curr.next;
      }
      curr = head.next;
    }
    return root;
  }
}
