public class SelectionSort {
    public static int[] solve(int[] array) {

        for(int i=0;i<array.length-1;i++){
            int globalMin = i;
            for(int j=i+1; j<array.length;j++){
                if(array[j]<array[globalMin]) {
                    globalMin = j; //find global minimum's location
                }
            }
            //swap global minimum and i
            int temp = array[i];
            array[i] = array[globalMin];
            array[globalMin] = temp;

        }
        return array;
    }
}