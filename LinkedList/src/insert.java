public class insert {



    public static void main(String[] args) {
        ListNode node = new ListNode(1);

        ListNode node3 = new ListNode(3);
        node.next = node3;

        ListNode node2 = new ListNode(2);

        node.next = node2;
        node2.next = node3;

        node.print();
    }
}
