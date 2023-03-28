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

        ListNode headTwo = head;
        ListNode newHead = new ListNode(-1);
        ListNode ans = newHead;

        int counter = 0;
        while (head.next != null) {
            counter++;
            head = head.next;
        }

        newHead.next = head;

        while (counter != 0) {
            newHead = newHead.next;
            head = headTwo;
            int tempCounter = counter - 1;
            while (tempCounter != 0) {
                tempCounter--;
                head = head.next;
            }
            newHead.next = new ListNode(head.val);
            counter--;
        }
        return ans.next;
    }

    public void solution() {
        System.out.println(reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))));
        System.out.println(reverseList(new ListNode(1, new ListNode(2, null))));
        System.out.println(reverseList(new ListNode()));

    }
}
