public class ReverseLinkedList {

    public static ListNode reverseIte(ListNode head){
        if (head == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode reverseRcr(ListNode head){
        //base rule
        if (head == null || head.next==null){
            return head;
        }
        // Recursive rule
        ListNode newHead = reverseRcr(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }



    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.print();

        ListNode res = reverseIte(head);
        ListNode resR = reverseRcr(head);
        res.print();
        resR.print();
    }
}
