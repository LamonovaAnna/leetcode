package _0_999._200_299;

// 206. Reverse Linked List
public class _206_ReverseLinkedList {
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

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummyNode = new ListNode(-1);

        while (head != null) {
            ListNode tail = dummyNode.next;
            dummyNode.next = new ListNode(head.val, tail);
            head = head.next;
        }
        return dummyNode.next;
    }

    public void solution() {
        System.out.println(reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
        System.out.println(reverseList(new ListNode(1, new ListNode(2, null))));
        System.out.println(reverseList(new ListNode()));

    }
}
