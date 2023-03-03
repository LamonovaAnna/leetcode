package _0_999._0_99;

// 21. Merge Two Sorted Lists
public class _21_MergeTwoSortedListsTODO {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }


        ListNode someNode = list1;
        ListNode temp;
        while (list2.next != null) {
            if (list1.val <= list2.val) {
                temp = list1.next;
                int one = list1.val;
                int two = list2.val;
                list1.next = list2;
                list2 = temp;
            }
            list1 = list1.next;

        }

        print(list1);

        return someNode;
    }

    private void print(ListNode temp) {
        StringBuilder sb = new StringBuilder();
        while (temp.next.next != null) {
            if (temp.next == null) {
                sb.append(temp.val);
                break;
            } else {
                sb.append(temp.val).append(",").append(" ");
            }
            temp = temp.next;
        }
        System.out.println(sb);
    }

    public void solution() {
        mergeTwoLists(new ListNode(1, new ListNode(2, new ListNode(4))), new ListNode(1, new ListNode(3, new ListNode(4))));
        mergeTwoLists(null, null);
        mergeTwoLists(null, new ListNode(0));
    }
}
