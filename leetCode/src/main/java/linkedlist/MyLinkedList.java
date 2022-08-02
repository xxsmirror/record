package linkedlist;

public class MyLinkedList {

    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }

    ListNode head;
    ListNode tail;
    int size;


    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void append(int number){
        ListNode newNode = new ListNode(number);
        if (tail==null){
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void insert(int position,int number)
    {
        if(position>size){return;}
        ListNode newNode = new ListNode(number);
        if(position==0){
            newNode.next=head;
            head = newNode;
            if(tail == null){
                tail=newNode;
            }
            size++;
        }else if(position==size){
            this.append(number);
        }else{
            ListNode prev = head;
            for (int i = 0; i < position-1; i++) {
                prev = prev.next;
            }
            ListNode now = prev.next;
            newNode.next=now;
            now=newNode;
            size++;
        }
    }

    public int get(int index) {
        return 0;
    }

    public void addAtHead(int val) {

    }

    public void addAtTail(int val) {

    }

    public void addAtIndex(int index, int val) {

    }

    public void deleteAtIndex(int index) {

    }
}
