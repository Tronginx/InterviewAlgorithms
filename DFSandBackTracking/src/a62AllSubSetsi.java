import java.util.ArrayList;
import java.util.List;

public class a62AllSubSetsi {
    public List<String> subsets(String input) {
        if (input == null) {
            return new ArrayList<String>();
        }

        StringBuilder cur = new StringBuilder();
        List<String> res = new ArrayList<>();
        int index = 0;
        char[] inputArr = input.toCharArray();

        dfs(cur, res, index, inputArr);

        return res;


    }

    private void dfs(StringBuilder cur, List<String> res, int index, char[] inputArr) {
        if (index == inputArr.length) {
            res.add(cur.toString());
            return;
        }


        dfs(cur, res, index + 1, inputArr);

        dfs(cur.append(inputArr[index]),res,index+1,inputArr);

        cur.deleteCharAt(cur.length() - 1);


    }


    public static void main(String[] args) {
        String input = "abc";

        a62AllSubSetsi sol = new a62AllSubSetsi();

        List<String> res = sol.subsets(input);

        System.out.println(res.toString());
    }
}
