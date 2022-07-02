public class MissingNumber {




    public int missing(int[] array) {

        int res = 0;
        int n = array.length + 1;

        for (int i = 0; i <= n; i++) {
            res ^= i;
        }

        for (int num : array) {
            res ^= num;
        }
        return res;
    }



        public static void main(String[] args) {

            int[] input = new int[]{1,2,4};

            MissingNumber sol = new MissingNumber();

            int res = sol.missing(input);

            System.out.println(res);
        }


}
