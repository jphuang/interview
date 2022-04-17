import java.util.HashMap;
import java.util.Map;

public class RotateRight {

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null ;
        }
        ListNode cur =  head ;
        int count = 0 ;
        Map<Integer,ListNode> map = new HashMap<Integer,ListNode>();
        while(cur.next != null){
            map.put(count,cur);
            count ++ ;
            cur = cur.next ;
        }
        map.put(count,cur);
        count ++ ;

        if (count <= 1) {
            return head ;
        }
        if(k%count == 0 ){
            return  head ;
        }
        cur.next  = head;
        int  j  = count - k%count -1 ;
        ListNode tmp = map.get(j).next;
        map.get(j).next = null;
        return  tmp;
    }
}
