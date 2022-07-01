public class Move0sToEnd {
    public static int[] moveZero(int[] array) {
        // Write your solution here
        if(array==null || array.length<=1){
            return array;
        }
        int left = 0;
        int right = array.length-1;

        while(left<=right){
            if(array[left]!=0){
                left++;
            }else if(array[right]==0) {
                right--;
            }else{
                swap(array,left++,right--);
            }
        }
        return array;
    }
    private static void swap(int[] array,int left,int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
