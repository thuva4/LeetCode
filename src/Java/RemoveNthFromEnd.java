package Java;

import java.util.HashMap;

public class RemoveNthFromEnd {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        HashMap<Integer, ListNode> hashMap = new HashMap<>();
        int i = -1;
        while(head!=null){
            i++;
            hashMap.put(i, head);
            head = head.next;
        }

        if(i-n==-1){
            return hashMap.get(1);
        }

        hashMap.get(i-n).next = hashMap.get(i-n+1).next;
        return hashMap.get(0);
    }
}
