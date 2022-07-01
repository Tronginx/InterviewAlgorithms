import java.util.LinkedList;
import java.util.Queue;

public class MaxInQueue {
    public int maxInQueue(Queue<Integer> queue) {

        int max = Integer.MIN_VALUE;
        int size = queue.size();
        for(int i=0;i<size;i++){
            int entry = queue.remove();
            if(entry>max){
                max = entry;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        MaxInQueue m = new MaxInQueue();
        int max = m.maxInQueue(queue);
        System.out.println(max);
    }
}
