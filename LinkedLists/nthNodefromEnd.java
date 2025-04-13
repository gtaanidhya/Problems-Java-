package LinkedLists;

public class nthNodefromEnd {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);
        list.insert(4, 3);
        list.insert(5, 4);
        list.printList();
        System.out.println(nthNodeFromEnd_On(0, list));
        System.out.println(nthNodeFromEnd_Brute(0, list));
        Counter counter = new Counter();
        System.out.println(nthNodeFromEnd_recursion(0, list.head , counter));
    }

    public static int nthNodeFromEnd_On(int n, LinkedList list) {
        int length = list.length();
        if (n > length || n==0) {
            return -1;
        }

        else {
            int i = 0;
            ListNode temp = list.head;
            // for temp = head, we havd i=0
            i++; // first we increase i then temp
            while (i <= length - n) {
                temp = temp.next;
                i++;
            }
            return temp.data;
        }
    }

    public static int nthNodeFromEnd_Brute(int n, LinkedList list) {
        int length = list.length();
        if (n - 1 >= length || n == 0) {
            return -1;
        } else {
            ListNode current = list.head;
            while (current != null) {
                int count = 0;

                ListNode temp = current.next;
                while (temp != null) {
                    count++;
                    temp = temp.next;
                }
                if (count == n - 1) {
                    break;
                }
                current = current.next;
            }
            return current.data;
        }
    }

    static class Counter {
        int count = 0;
    }

    public static int nthNodeFromEnd_recursion(int n, ListNode head,Counter counter) {
        if (head == null) {
            return -1;
        }

        int node = nthNodeFromEnd_recursion(n, head.next,counter);
        counter.count++;
        if (counter.count == n) {
            return head.data;
        }
        return node;
    }
}
