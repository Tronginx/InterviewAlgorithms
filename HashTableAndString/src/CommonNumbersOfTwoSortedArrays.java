import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonNumbersOfTwoSortedArrays {

    public static List<Integer> common(int[] A, int[] B) {
        // Write your solution here
        if (A == null || B == null) {
            return new ArrayList<Integer>();
        }


        int len = Math.min(A.length,B.length);
        int aIndex = 0;
        int bIndex = 0;
        List<Integer> res = new ArrayList<>();
       while (aIndex < A.length && bIndex < B.length) {
            if (A[aIndex] < B[bIndex]) {
                aIndex++;
            } else if (A[aIndex] > B[bIndex]) {
                bIndex++;
            } else if (A[aIndex] == B[bIndex]){
                res.add(A[aIndex]);
                aIndex++;
                bIndex++;

            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] one = new int[]{0,0,1,3,4,7,7,8,12,12,15,15,18,20,22,23,23,23,26,26,26};
        int[] two = new int[]{0,1,3,3,4,5,5,7,7,9,11,11,13,13,18,19,22,22,22,23,23};

        List<Integer> res = common(one,two);

        System.out.println(Arrays.toString(res.toArray()));
    }
}

