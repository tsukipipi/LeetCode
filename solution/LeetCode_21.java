
public class LeetCode_21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = new ListNode(0),p = list;
        while(l1 != null || l2 != null){
            if (l2 == null) {
                p.next = new ListNode(l1.val);
                p = p.next;
                l1 = l1.next;
                continue;
            }
            if (l1 == null) {
                p.next = new ListNode(l2.val);
                p = p.next;
                l2 = l2.next;
                continue;
            }
            if (l1.val < l2.val) {
                p.next = new ListNode(l1.val);
                p = p.next;
                l1 = l1.next;
            }
            else {
                p.next = new ListNode(l2.val);
                p = p.next;
                l2 = l2.next;
            }
        }
        return list.next;
    }
}

