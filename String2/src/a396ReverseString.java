public class a396ReverseString {
    public String reverse(String input) {

        if (input == null || input.length() == 0) {
            return input;
        }

        char[] inputArr = input.toCharArray();

        for (int i = 0, j = inputArr.length - 1; i <= j; i++, j--) {
            swap(inputArr, i, j);
        }
        return new String(inputArr);
    }

    private void swap(char[] array, int left, int right) {
        char temp =  array[left];
        array[left] = array[right];
        array[right] = temp;

    }


    public static void main(String[] args) {
        String one = "one";
        String four = "four";

        a396ReverseString sol = new a396ReverseString();
        String res = sol.reverse(one);
        String res2 = sol.reverse(four);

        System.out.println(res);
        System.out.println(res2);
    }
}