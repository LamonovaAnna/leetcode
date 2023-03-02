package _0_999._0_99;

// 19. Remove Nth Node From End of List
public class _19_RemoveNthNodeFromEndOfList {
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


    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode temp = new ListNode(-1, head);
        ListNode left = temp;
        ListNode right = head;

        while (n > 0 && right != null && right.next != null) {
            right = right.next;
            n--;
        }

        while (right != null) {
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;

        return temp.next;
    }

    public void solution() {
        System.out.println(removeNthFromEnd(new ListNode(1, new ListNode(2, null)), 2));
        System.out.println(removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));


        System.out.println(removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2));
        System.out.println(removeNthFromEnd(new ListNode(1, null), 1));

    }

}
