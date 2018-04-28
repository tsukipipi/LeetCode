

public class LeetCode_2 {

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        int carry = 0;
        while (l1 != null || l2 != null){
            if (l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
            p.val = carry % 10;
            carry = carry / 10;
            if (l1 != null || l2 != null || carry == 1){
                p.next = new ListNode(0);
                p = p.next;
            }
        }
        if (carry == 1)p.val = 1;
        return head;
    }

}

//链表结点
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }


}