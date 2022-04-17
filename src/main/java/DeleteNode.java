import java.util.HashSet;
import java.util.Set;

public class DeleteNode {
    public static  ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode cur = new ListNode(head.val) ;
        ListNode tmp = cur;
        set.add(cur.val);
        while (head!= null) {
            if (set.contains(head.val)){
                head = head.next;
                continue;
            }
            cur.next = new ListNode(head.val);
            cur = cur.next;
            set.add(cur.val);
            head = head.next;
        }
        return tmp;
    }
}
