
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      public static ListNode NewListNode(int[] nums) {
            if (nums.length == 0 ) {
                  return new ListNode() ;
            }
            ListNode node = new ListNode(nums[0]);
            ListNode curr = node;
            for (int i = 1; i < nums.length; i++) {
                  curr.next = new ListNode(nums[i]);
                  curr = curr.next;
            }
            return node ;
      }
}
