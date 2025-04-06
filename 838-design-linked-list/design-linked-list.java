class MyLinkedList {
   private int size;
   private ListNode head;

   private class ListNode {
       int val;
       ListNode next;
       ListNode(int val){
           this.val = val;
       }
   }
   
   public MyLinkedList(){
       size = 0;
       head = null;
   }

   public int get(int index) {
       if (index < 0 || index >= size || head == null) {
           return -1;
       }
       ListNode current = head;
       for (int i = 0; i < index; i++) {
           current = current.next;
       }
       return current.val;
   }

   public void addAtHead(int val) {
       ListNode newnode = new ListNode(val);
       newnode.next = head;
       head = newnode;
       size++;
   }

   public void addAtTail(int val) {
       ListNode newnode = new ListNode(val);
       if (head == null) {
           head = newnode;
       } else {
           ListNode current = head;
           while (current.next != null) {
               current = current.next;
           }
           current.next = newnode;
       }
       size++;
   }

   public void addAtIndex(int index, int val) {
       if (index < 0 || index > size) {
           return;
       }
       if (index == 0) {
           addAtHead(val);
           return;
       }
       
       ListNode newnode = new ListNode(val);
       ListNode current = head;
       for (int i = 0; i < index - 1; i++) {
           current = current.next;
       }
       newnode.next = current.next;
       current.next = newnode;
       size++;
   }

   public void deleteAtIndex(int index){
       if (index < 0 || index >= size) {
           return;
       }
       if (index == 0) {
           head = head.next;
       } else {
           ListNode current = head;
           for (int i = 0; i < index - 1; i++) {
               current = current.next;
           }
           current.next = current.next.next;
       }
       size--;
   }
}