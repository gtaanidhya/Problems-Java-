package LinkedLists;

public class LinkedList {

    public LinkedList() {
        length = 0;
    }

    ListNode head;
    private int length = 0;

    public void insert(int data, int position) {
        if (position < 0) {
            position = 0; // fix the position
        }
        if (position > length) {
            position = length;
        }
        if (head == null) {
            head = new ListNode(data); // if list is empty
        } else if (position == 0) { // if adding at the front
            ListNode temp = new ListNode(data);
            temp.next = head;
            head = temp;
        } else {
            ListNode temp = head;
            /*
             * Don't get confused here. The loop is starting here because we have already
             * set temp = head which means we are already at position 0, so we should start
             * from position 1
             */
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }
    /* Time complexity:O(n) Space complexity:O(1) */

    public void remove(int position) {
        if (position < 0) {
            position = 0; // fix the position
        }
        if (position >= length) {
            position = length - 1;
        }
        if (head == null) {
            return;
        }
        if (position == 0) {
            head = head.next;
        } else {
            ListNode temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        length--;
    }
    /* Time complexity:O(n) Space complexity:O(1) */

    public void printList() {
        ListNode temp = this.head;
        while (temp != null) {
            if (temp.next == null) {
                System.out.print(temp.data);
            } else {
                System.out.print(temp.data + " -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    public int length() {
        return length;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);
        list.insert(4, 3);
        list.insert(5, 4);
        list.printList();
        list.insert(100, 1);
        list.printList();

    }

}
