// Given the head of a singly linked list, return the middle node of the linked list.
// If there are two middle nodes, return the second middle node.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode traverse = head;
        ListNode middle = head;
        float n = 0;
        while(traverse.next != null){
            n++;
            traverse = traverse.next;
        }
        for(int i=0; i < n/2; i++){
            middle = middle.next;
        }
        return middle;
    }
}