public class BinarySearch {

    public static int binarySearch(int[] array, int target){

        int left = 0;
        int right = array.length-1;

        if(array==null||array.length==0){
            return -1;
        }

        while(left<=right){
            int pivot = left + (right-left)/2;
            if(array[pivot] == target){
                return pivot;
            }
            else if(array[pivot]>target){
                right = pivot-1;
            }
            else {
                left = pivot + 1;
            }
        }

        return -1;




    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
}