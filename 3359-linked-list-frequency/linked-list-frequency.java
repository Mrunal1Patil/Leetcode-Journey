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
    public ListNode frequenciesOfElements(ListNode head) {
        Map<Integer,Integer> store = new HashMap<>();
        ListNode current = head;
        while(current!=null){
            store.put(current.val,store.getOrDefault(current.val,0)+1);
            current=current.next;
        }
        ListNode dummyhead = new ListNode();
        ListNode tailend = dummyhead;
        for(int freq : store.values()){
            tailend.next = new ListNode(freq);
            tailend=tailend.next;
        }
    return dummyhead.next;
    }
}