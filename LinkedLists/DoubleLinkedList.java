package LinkedLists;

public class DoubleLinkedList {
    public class DLLnode {
        int data;
        DLLnode next;
        DLLnode prev;

        public DLLnode(int data) {
            this.data = data;
        }
    }

    DLLnode head;
    int length = 0;

    public int length() {
        return this.length;
    }

    public void insert(int data, int position) {
        if (position < 0) {
            position = 0;
        }
        if (position > length) {
            position = length;
        }
        if (head == null) {
            head = new DLLnode(data);
        } else if (position == 0) {
            DLLnode newNode = new DLLnode(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            DLLnode temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            DLLnode newNode = new DLLnode(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            if (newNode.next != null) {
                newNode.next.prev = newNode;
            }
        }
        length++;
    }

    public void rmeove(int position) {
        if (position < 0) {
            position = 0;
        }
        if (position > length) {
            position = length;
        }

        if (head == null) {
            return;
        }
        if (position == 0) {
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            } else {
                head = null;
            }
        }
        else {
            DLLnode temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next != null) {
                temp.next.prev = temp;
            }
            
        }
        length--;
    }

    public void printList() {
        DLLnode temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " = ");
            if (temp.prev != null) {
                System.out.print("prev:" + temp.prev.data + " ");
            }
            if (temp.next != null) {
                System.out.print("next:" + temp.next.data);
            }
            System.out.println();
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);
        list.insert(4, 3);
        list.insert(5, 4);
        list.printList();
        list.insert(100, 1);
        list.printList();
        list.rmeove(5);
        list.printList();
        System.out.println(list.length());
    }

}
