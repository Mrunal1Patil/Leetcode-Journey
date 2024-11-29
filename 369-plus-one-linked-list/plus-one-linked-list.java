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
    public ListNode plusOne(ListNode head) {
        if(head==null){
            return new ListNode(1);
        }
        int carry = 1;
        ListNode reversed = reverse(head);
        ListNode current = reversed;
        ListNode prev = null;
        while(current!=null){
            int sum = current.val + carry;
            carry = sum / 10;
            current.val = sum%10;
            prev = current;
            current=current.next;
        }
        if(carry>0){
            prev.next = new ListNode(carry);
        }
        return reverse(reversed);
    }
    private ListNode reverse(ListNode head){
        ListNode current = head; 
        ListNode prev = null;

        while(current!=null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current=next;
        }
        return prev;
    }
}