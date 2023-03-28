package _1000_1999._1200_1299;

import _0_999._0_99._19_RemoveNthNodeFromEndOfList;

// 1290. Convert Binary Number in a Linked List to Integer
public class _1290_ConvertBinaryNumberInALinkedListToInteger {
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

    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();

        while (head.next != null) {
            sb.append(head.val);
            head = head.next;
        }
        sb.append(head.val);

        return Integer.parseInt(sb.toString(), 2);
    }

    public void solution() {
        System.out.println(getDecimalValue(new ListNode(1, new ListNode(0, new ListNode(1, null)))));
        System.out.println(getDecimalValue(new ListNode(0, null)));

    }
}
