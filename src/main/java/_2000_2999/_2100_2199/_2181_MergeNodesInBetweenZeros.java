package _2000_2999._2100_2199;

import _0_999._0_99._21_MergeTwoSortedLists;

// 2181. Merge Nodes in Between Zeros
public class _2181_MergeNodesInBetweenZeros {
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

    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode newHead = ans;

        while (head != null) {
            if (head.val != 0) {
                if (ans == null) {
                    ans = new ListNode(head.val);
                } else {
                    ans.val += head.val;
                }
                if (head.next.val == 0) {
                    if (head.next.next != null) {
                        ans.next = new ListNode(0);
                        ans = ans.next;
                    }
                }
            }
            head = head.next;
        }
        return newHead;
    }

    public void solution() {
        mergeNodes(new ListNode(0, new ListNode(3, new ListNode(1, new ListNode(
                0, new ListNode(4, new ListNode(5, new ListNode(2, new ListNode(0)))))))));
    }


}
