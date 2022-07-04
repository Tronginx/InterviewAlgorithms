import java.util.ArrayList;
import java.util.List;

public class AllValidParentheses {
    public List<String> validParentheses(int n) {

        if (n < 1) {
            return new ArrayList<String>();
        }

        StringBuilder cur = new StringBuilder();
        List<String> res = new ArrayList<>();
        int leftAdded = 0;
        int rightAdded = 0;
        dfs(cur, res, leftAdded, rightAdded, n);

        return res;
    }

    private void dfs(StringBuilder cur, List<String> res, int leftAdded, int rightAdded, int n) {

        if (leftAdded == n && rightAdded == n) {
            res.add(cur.toString());
            return;
        }

        if (leftAdded < n) {
            dfs(cur.append('('), res, leftAdded + 1, rightAdded, n);
            cur.deleteCharAt(cur.length()-1);
        }

        if (rightAdded < leftAdded) {
            dfs(cur.append(')'), res, leftAdded, rightAdded + 1, n);
            cur.deleteCharAt(cur.length()-1);
        }

    }

    public static void main(String[] args) {


        AllValidParentheses sol = new AllValidParentheses();
        List<String> res = sol.validParentheses(3);
        System.out.println(res.toString());
    }

}
