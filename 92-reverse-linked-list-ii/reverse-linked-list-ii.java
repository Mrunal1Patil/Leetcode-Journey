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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode();
        dummy.next=head;
        ListNode pre = dummy;
        for(int i=1;i<left;i++){
            pre = pre.next;
        }
        ListNode start = pre.next;
        ListNode then = start.next;

        for(int i=0;i<right-left;i++){
            start.next=then.next;
            then.next=pre.next;
            pre.next=then;
            then=start.next;
        }
        return dummy.next;
}
        
    }
    