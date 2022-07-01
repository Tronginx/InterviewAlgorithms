import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestInUnsortedArray {

    public static int[] kSmallestI(int[] array, int k) {
        if (array == null || array.length == 0 || k == 0) {
            return new int[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){

                if (o1.equals(o2)) {
                    return 0;
                }
                return o1 > o2 ? -1 : 1;
            }

        });
        for (int i = 0; i < array.length; i++) {
            if (i < k) {
                maxHeap.offer(array[i]);
            } else if (maxHeap.peek() > array[i]) {
                maxHeap.poll();
                maxHeap.offer(array[i]);
            }
        }
        int[] result = new int[k];
        for (int j = k - 1; j >= 0; j--) {
            result[j] = maxHeap.poll();
        }
        return result;

    }

    public static void main(String[] args) {

        int[] array = new int[]{-1,7,9,5,0};

        System.out.println(Arrays.toString(array));

        int[] newArray = kSmallestI(array, 3);
        System.out.println(Arrays.toString(newArray));


    }
}