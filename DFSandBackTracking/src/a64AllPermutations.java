import java.util.ArrayList;
import java.util.List;

public class a64AllPermutations {
    public List<String> permutations(String input) {

        if (input == null) {
            return new ArrayList<String>();
        }
        List<String> res = new ArrayList<>();
        int index = 0;
        char[] inputArr = input.toCharArray();

        dfs(inputArr, res, index);

        return res;
    }

    private void dfs(char[] inputArr, List<String> res, int index){

        if (index == inputArr.length-1) {
            res.add(new String(inputArr));
            return;
        }

        for (int i = index; i < inputArr.length; i++) {
            swap(inputArr, index, i);
            dfs(inputArr, res, index + 1);
            swap(inputArr, index, i);
        }

    }

    private void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


    public static void main(String[] args) {
        String input = "abc";
        a64AllPermutations sol = new a64AllPermutations();

        List<String> res = sol.permutations(input);

        System.out.println(res.toString());
    }
}
