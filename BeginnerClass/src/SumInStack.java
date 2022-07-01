import java.util.Deque;
import java.util.LinkedList;

public class SumInStack {
    public int sumOfStack(Deque<Integer> stack) {
        int sum =0;
        int size = stack.size();
        for(int i=0;i<size;i++){
            sum += stack.removeFirst();
        }
        return sum;
    }

    public static void main(String[] args) {
        SumInStack s = new SumInStack();

        Deque<Integer> stack = new LinkedList<Integer>();
        stack.addFirst(1);
        stack.addFirst(2);
        stack.addFirst(1);

        int sum = s.sumOfStack(stack);

        System.out.println(sum);

    }
}
