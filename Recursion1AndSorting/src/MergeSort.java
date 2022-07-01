public class MergeSort {

    public static int[] mergeSort(int[] array) {
        // Write your solution here
        if(array == null || array.length<=1){
            return array;
        }
        return mergeSort(array,0,array.length-1); //bug1: right should be array.length-1

    }

    private static int[] mergeSort(int[] array, int left, int right) {
        // Write your solution here
        if(left == right){
            return new int[] {array[left]};
        }
        int mid = left + (right-left)/2;

        int[] leftArr = mergeSort(array,left,mid);
        int[] rightArr = mergeSort(array,mid+1,right); // Bug2: didn't think about semantic meaning before recklessly coding

        return merge(leftArr,rightArr);
    }

    private static int[] merge(int[] left, int[] right){
        int[] res = new int[left.length+right.length];

        int leftIndex = 0 ,rightIndex = 0,scanIndex =0; // use meaningful index name
        while(leftIndex <left.length && rightIndex<right.length){
            if(left[leftIndex]<right[rightIndex]){
                res[scanIndex] = left[leftIndex];
                leftIndex++;
            }
            else{
                res[scanIndex] = right[rightIndex];
                rightIndex++;
            }
            scanIndex ++;
        }
        //post-processing rest of orphans
        while(leftIndex<left.length){
            res[scanIndex] = left[leftIndex];
            scanIndex++;
            leftIndex++;
        }
        while(rightIndex<right.length){
            res[scanIndex] = right[rightIndex];
            scanIndex++;
            rightIndex++;
        }



        return res;
    }



}
