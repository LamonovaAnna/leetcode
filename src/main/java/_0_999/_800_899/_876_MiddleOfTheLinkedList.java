package _0_999._800_899;

// 876. Middle of the Linked List
public class _876_MiddleOfTheLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode temp = head;

        int counter = 0;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }

        int middle = counter / 2;

        while (middle != 0) {
            middle--;
            head = head.next;
        }
        return head;
    }

    public void solution() {
        middleNode(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(
                4, new ListNode(5))))));
    }
}
