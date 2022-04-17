import org.junit.jupiter.api.Test;

public class TestDeleteNode {
    @Test
    public void deleteDuplicatesTest(){
        int[] nums = new  int[]{1,2,3,3,4,4,5} ;
        ListNode head = ListNode.NewListNode(nums);
        ListNode listNode = DeleteNode.deleteDuplicates(head);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
