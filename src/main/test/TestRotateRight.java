
import org.junit.jupiter.api.Test;

public class TestRotateRight {

    @Test
    public void rotateRightTest(){
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode listNode = RotateRight.rotateRight(head, 2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next ;
        }
    }

    @Test
    public void rotateRight2Test(){
        int[] nums = new  int[]{} ;
        ListNode head = ListNode.NewListNode(nums);
        ListNode listNode = RotateRight.rotateRight(head, 0);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next ;
        }
    }
}
