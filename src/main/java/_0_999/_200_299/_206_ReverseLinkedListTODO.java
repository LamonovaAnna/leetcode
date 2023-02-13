package _0_999._200_299;

public class _206_ReverseLinkedListTODO {
    class Node<T> {
        public T data;
        public Node<T> next;


        public Node( T data, Node<T> next) {
            this.data = data;
            this.next = next;

        }
    }

    public static class ListNode<T> {
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
        ListNode second = head.next.next;
        ListNode first = head.next;
        first = null;
        second = first;
        while (head.next != null) {

        }
        return null;

    }

    public void solution() {

    }
}
