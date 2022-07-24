import java.util.ArrayList;
import java.util.List;

public class AllSubsets {

    public List<String> findAllSubsets(String input) {

        List<String> res = new ArrayList<String>();
        if (input == null || input.length() == 0) {
            return res;
        }
        StringBuilder sb = new StringBuilder();
        char[] inputArr = input.toCharArray();
        dfs(res, sb, inputArr, 0);
        return res;
    }

    private void dfs(List<String> res, StringBuilder sb, char[] inputArr, int index) {
        if (index == inputArr.length) {
            res.add(new String(sb));
            return;
        }
        dfs(res, sb, inputArr, index + 1);
        dfs(res, sb.append(inputArr[index]), inputArr, index + 1);
        sb.deleteCharAt(sb.length() - 1);



    }

    public static void main(String[] args) {
        String input = "abc";

        AllSubsets sol = new AllSubsets();

        List<String> res = sol.findAllSubsets(input);

        System.out.println(res.toString());
    }

}
