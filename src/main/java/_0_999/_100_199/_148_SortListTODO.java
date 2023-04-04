package _0_999._100_199;

// 148. Sort List
public class _148_SortListTODO {

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

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode secHead = dummy;

        while (head != null && head.next != null) {
            if (head.val > head.next.val) {
                dummy.next = new ListNode(head.next.val, head);
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return null;
    }

    public void solution() {
        sortList(new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3)))));
    }


}
