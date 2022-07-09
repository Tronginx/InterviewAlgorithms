import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class a65AllPermutations {
    public List<String> permutation(String input) {

        if (input == null || input.length() == 0) {
            return new ArrayList<String>();
        }

        List<String> res = new ArrayList<>();
        char[] array = input.toCharArray();
        int index = 0;
        dfs(res, index, array);
        return res;

    }


    private void dfs(List<String> res, int index, char[] array) {

        if (index == array.length) {
            res.add(new String(array));
        }

        Set<Character> set = new HashSet<>();
        for (int i = index ; i < array.length; i++) {
            if (set.add(array[i])) {
                swap(array, index, i);
                dfs(res,index + 1, array);
                swap(array, index, i);
            }
        }
    }


    private void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        String input = "aba";

        a65AllPermutations sol = new a65AllPermutations();
        List<String> res = sol.permutation(input);
        System.out.println(res.toString());
    }

}
