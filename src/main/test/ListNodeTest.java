import org.junit.Test;

public class ListNodeTest {

    @Test
    public void reverseList() {
        ListNode list = ListNode.NewListNode(new int[] {1, 2, 3, 4});
        ListNode listNode = new ListNode();
        list = listNode.reverseList(list);
        System.out.println(list);
    }
}
