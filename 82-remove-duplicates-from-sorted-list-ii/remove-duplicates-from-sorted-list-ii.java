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
    public ListNode deleteDuplicates(ListNode head) {
       ListNode dummy = new ListNode(-1);
       dummy.next = head;
       ListNode prev = dummy;

       while(head!=null){
        boolean isD = false;

        while(head.next!=null && head.val==head.next.val){
            head=head.next;
            isD = true;
        }
        if(isD){
            prev.next=head.next;
        }
        else{
            prev=prev.next;
        }
        head=head.next;
       }
       return dummy.next;
    }
}