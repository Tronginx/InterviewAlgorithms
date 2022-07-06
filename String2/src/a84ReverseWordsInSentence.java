public class a84ReverseWordsInSentence {
    public String reverse(String input) {

        char[] inputArr = input.toCharArray();
        reverseHelper(inputArr, 0, inputArr.length - 1);

        int start = 0;
        for (int i = 0; i < inputArr.length; i++) {

            if (inputArr[i] != ' ' && (i == 0 || inputArr[i-1] == ' ')) {
                start = i;
            }
            if (inputArr[i] != ' ' && (i == inputArr.length - 1 || inputArr[i+1] == ' ')) {
                reverseHelper(inputArr, start, i);
            }
        }

        return new String(inputArr);


    }





    public void reverseHelper(char[] input, int left , int right) {

        for (int i = left, j =right; i <= j; i++, j--) {

            swap(input, i, j);
        }



    }


    private void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;

    }




    public static void main(String[] args) {
        String one = "I love yahoo";

        a84ReverseWordsInSentence sol = new a84ReverseWordsInSentence();
        String res = sol.reverse(one);
        System.out.println(res);
    }

}
