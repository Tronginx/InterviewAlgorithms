import java.util.Arrays;
import java.util.stream.IntStream;

public class a197ReOrderArray {


    public int[] reOrder(int[] input) {


        if (input.length % 2 == 0) {
            helper(input, 0, input.length - 1);

        } else {
            helper(input, 0, input.length - 2);
        }
        return input;

    }

    private void helper(int[] array, int left, int right) {

        System.out.println(left);
        System.out.println(right);
        System.out.println(Arrays.toString(array));
        System.out.println("----------------------------");


        int size = right - left + 1;
        if (size <= 2) {
            return;
        }

        int mid = left + size / 2;
        int leftMid = left + size / 4;
        int rightMid =left + size * 3 / 4;


        reverse(array, leftMid, mid - 1);
        reverse(array, mid, rightMid-1);
        reverse(array, leftMid,rightMid-1);

        helper(array, left, left + 2 * (leftMid - left) - 1);
        helper(array, left + 2* (leftMid - left), right);


    }

    private void reverse(int[] array, int left, int right) {

        while (left <= right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        int[] input1 = new int[]{1,2,3,11,22,33};

        a197ReOrderArray sol = new a197ReOrderArray();

        int[] res1 = sol.reOrder(input1);
        //int[] res2 = sol.reOrder(input2);

        System.out.println(Arrays.toString(res1));
        //System.out.println(Arrays.toString(res2));

    }

}
