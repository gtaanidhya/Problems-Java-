package LinkedLists;

public class LinkedList {
    public LinkedList() {
        length = 0;
    }

    ListNode head;
    private int length = 0;

    public synchronized ListNode getHead() {
        return head;
    }

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
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            ListNode newNode = new ListNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }

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

    public int length() {
        return length;
    }

}
