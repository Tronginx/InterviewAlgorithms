public class QuickSort {
    public static int[] quickSort(int[] array) {
        // Write your solution here
        if(array == null){
            return array;
        }
        quickSort(array,0, array.length-1);
        return array;
    }

    public static void quickSort(int[]array,int left,int right){
        //base case
        if(left>=right){
            return;
        }
        //recursive rule
        int pivotPos = partition(array,left,right);

        quickSort(array,left,pivotPos-1);//Bug 1: right should be pivot-1
        quickSort(array,pivotPos+1,right);

    }

    private static int partition(int[] array,int left, int right) {

        int pivotIndex = pivotIndex(left,right);
        int pivot = array[pivotIndex];//!!BUG3: pivot value needs to be stored, otherwise it will be swapped to undesired value!!

        swap(array,pivotIndex,right);
        int leftBound = left; // if index < small, value < pivot
        int rightBound = right-1;//bug2: rightBound should be right-1
        while(leftBound<=rightBound){
           if(array[leftBound]<pivot){
               leftBound++;
           } else if(array[rightBound]>=pivot){
               rightBound--;
           } else{
                swap(array,leftBound++,rightBound--);
           }
        }
        swap(array,leftBound,right); // put pivot in its absolute correct location
        return leftBound; // return the partition point where left smaller than the pivot, right larger than the pivot

    }
    private static int pivotIndex(int left, int right){
        return left + (int)(Math.random()*(right-left+1)); // why +1?
    }


    private static void swap(int[] array,int left,int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
