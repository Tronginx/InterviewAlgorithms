import java.sql.SQLOutput;

class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        next = null;
    }
    public ListNode() {
        next = null;
    }

    public void print(){
        if(this == null){
            System.out.println("The linked list is null.");
            return;
        }
        String res = String.valueOf(this.value);
        ListNode cur = this.next;
        while(cur!=null){
            res += "->"+cur.value;
            cur = cur.next;
        }
        System.out.println(res);
    }
    


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.print();
    }

}