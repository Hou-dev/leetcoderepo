class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode curr = head;
        while (head.next != null) {
            ListNode prev = head.next;
            head.next = prev.next;
            prev.next = curr;
            curr = prev;
        }
        return curr;
    }
}