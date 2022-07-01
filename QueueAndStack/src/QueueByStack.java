import java.util.ArrayDeque;
import java.util.Deque;

public class QueueByStack {
    int size;
    Deque<Integer> stackToPoll;
    Deque<Integer> stackToOffer;

    public QueueByStack() {
        // Write your solution here.
        this.size = 0;
        this.stackToPoll =  new ArrayDeque<>();
        this.stackToOffer = new ArrayDeque<Integer>();
    }


    public Integer poll() {
        move();
        if (!stackToPoll.isEmpty()) {
            return stackToPoll.pollFirst();

        } else {
            return null;
        }
    }

    public void offer(int element) {
        stackToOffer.offerFirst(element);
    }

    public Integer peek() {
        move();
        if (!stackToPoll.isEmpty()) {
            return stackToPoll.peekFirst();
        } else {
            return null;
        }
    }

    public int size() {
        return stackToOffer.size() + stackToPoll.size();
    }

    public boolean isEmpty() {
        return  this.size() == 0;
    }

    private void move() {
        if (stackToPoll.isEmpty()) {
            while (!stackToOffer.isEmpty()) {
                stackToPoll.offerFirst(stackToOffer.pollFirst());
            }
        }
    }


    public static void main(String[] args) {
        QueueByStack queue = new QueueByStack();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        int one = queue.poll();

        queue.offer(7);
        queue.offer(8);

        int res = queue.poll();
        System.out.println(queue.peek());


    }
}
