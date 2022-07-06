public class a397RightShiftByNCharacters {
    public String shift(String input, int n) {

        int shiftPos = n % input.length();

        char[] array = input.toCharArray();
        reverse(array, 0, array.length - 1);

        reverse(array, 0, shiftPos - 1);
        reverse(array, shiftPos, array.length - 1);

        return new String(array);

    }

    public String shift2(String input, int n) {

        int shiftPos = n % input.length();

        char[] array = input.toCharArray();
        reverse(array, 0, shiftPos - 1);
        reverse(array, shiftPos, array.length - 1);
        reverse(array, 0, array.length - 1);



        return new String(array);

    }


    private void reverse(char[] array, int left, int right) {

        while (left <= right) {

            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        String input = "abcd";

        a397RightShiftByNCharacters sol = new a397RightShiftByNCharacters();
        a397RightShiftByNCharacters sol2 = new a397RightShiftByNCharacters();

        String res = sol.shift(input, 2);

        System.out.println(res);

        String res2 = sol2.shift2(input, 2);

        System.out.println(res2);
    }
}
