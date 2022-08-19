 #include <stdio.h>
 
 struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
 };


class Solution {
public:
    void deleteNode(ListNode* node) {
        node->val = node->next->val;
        ListNode * next = node->next->next;
        ListNode * last = node;
        last->next = next;
    }
};