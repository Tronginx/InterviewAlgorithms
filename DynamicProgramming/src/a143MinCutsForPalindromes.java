public class a143MinCutsForPalindromes {

    public int minCuts(String input) {
       if (input == null || input.length() <= 1) {
            return 0;
        }
       char[] array = input.toCharArray();
       int n = array.length;
       int[] M = new int[n + 1];
       M[0] = 0;
       M[1] = 0;
       for (int i = 2; i < M.length; i++) {
           int minCutForI = Integer.MAX_VALUE;
           for (int j = 0; j < i; j++) {
               if (isPalindrome(array,j, i - 1)){
                    if (j == 0) {
                        minCutForI = 0;
                        break;
                    } else {
                        minCutForI = Math.min(minCutForI, M[j] + 1);
                    }
               }
           }
           M[i] = minCutForI;
       }
        return M[n];
    }
    private boolean isPalindrome(char[] input, int i, int j) {

        while (i < j) {
            if (input[i++] != input[j--]) {
                return false;
            }
        }


        return true;

    }


}
