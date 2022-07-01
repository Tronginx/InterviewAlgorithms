public class RainbowSort {
    public static int[] rainbowSort(int[] array) {
        // Write your solution here
        if(array == null || array.length==0){
            return array;
        }
        int redBound = 0;
        int greenBound = 0; //BUG1: greenBound should start at same place as redBound
        int blueBound = array.length-1;

        while(greenBound<=blueBound){
            if(array[greenBound]==-1){
                swap(array,redBound,greenBound);
                redBound++;
                greenBound++;
            }else if(array[greenBound]==0){
                greenBound++;
            }else{
                swap(array,greenBound,blueBound);
                blueBound--;
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
