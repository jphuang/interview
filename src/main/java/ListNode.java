public class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode NewListNode(int[] nums) {
    if (nums.length == 0) {
      return new ListNode();
    }
    ListNode node = new ListNode(nums[0]);
    ListNode curr = node;
    for (int i = 1; i < nums.length; i++) {
      curr.next = new ListNode(nums[i]);
      curr = curr.next;
    }
    return node;
  }
  // 1290. 二进制链表转整数
  // 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
  // 请你返回该链表所表示数字的 十进制值 。
  public int getDecimalValue(ListNode head) {
    int sum = 0;
    while (head != null) {
      sum = sum * 2 + head.val;
      head = head.next;
    }
    return sum;
  }
}
