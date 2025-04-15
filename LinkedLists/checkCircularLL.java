package LinkedLists;

public class checkCircularLL {
    public static boolean checkCircularLL_brute(LinkedList list) {
        int length = list.length();
        int currPos = 1;
        ListNode temp = list.head;
        boolean circular = false;
        while (temp != null && currPos <= length) {
            if (temp.next != null) {
                int internalPos = currPos + 1;
                ListNode temp1 = temp.next;
                while (temp1 != null && internalPos <= length + 1) {
                    if (temp == temp1) {
                        circular = true;
                        break;
                    }
                    temp1 = temp1.next;
                    internalPos++;
                }
                if (circular) {
                    break;
                }
                temp = temp.next;
            }
            currPos++;
        }
        
        return circular;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1, 0);
        list.insert(2, 1);
        list.insert(3, 2);
        list.insert(4, 3);
        list.insert(5, 4);
        list.insert(6, 5);
        list.insert(7, 6);
        list.insert(8, 7);
        ListNode temp = list.head;
        ListNode temp1=list.head;
        int pos=1;
        while (pos < 3) {
            temp1 = temp1.next;
            pos++;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = temp1;
        System.out.println(checkCircularLL_brute(list));
    }
}
