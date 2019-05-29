package Java;


public class SwapNodesinPairs {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        } else {
            ListNode updatedHead = head.next;
            ListNode previousHead = head;
            ListNode currentHead = previousHead.next;
            ListNode pre = null;
            while(previousHead!=null && currentHead!=null){
                previousHead.next = currentHead.next;
                currentHead.next = previousHead;
                if(pre!=null) pre.next = currentHead;
                if(previousHead.next==null) break;
                currentHead = previousHead.next.next;
                pre = previousHead;
                previousHead = previousHead.next;

            }
            return updatedHead;
        }
    }
}
