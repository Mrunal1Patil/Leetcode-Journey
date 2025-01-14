class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int length = 0;
        ListNode oldTail = head;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
            length++;
        }
        length++;
        int rotations = k % length;
        if (rotations == 0) {
            return head; 
        }
        ListNode newTail = head;
        for (int i = 1; i < length - rotations; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;

        oldTail.next = head;

        return newHead;
    }
}
