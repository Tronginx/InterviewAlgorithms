import java.util.ArrayList;
import java.util.List;

public class AllValidParentheses {
    public List<String> allValidParen(int n) {

        List<String> res = new ArrayList<String>();
        if (n <= 0) {
            return res;
        }
        StringBuilder sb = new StringBuilder();
        backtracking(res, sb, n, 0, 0);
        return res;

    }

    private void backtracking(List<String> res, StringBuilder sb, int n, int leftAdded, int rightAdded) {

        if (leftAdded == n && rightAdded == n) {
            res.add(sb.toString());
            return;
        }

        if (leftAdded < n) {
            backtracking(res, sb.append("("), n, leftAdded + 1, rightAdded);
        }

        if (rightAdded < leftAdded) {
            backtracking(res, sb.append(")"), n, leftAdded, rightAdded + 1);
        }

        sb.deleteCharAt(sb.length() - 1);

    }


    public static void main(String[] args) {


        AllValidParentheses sol = new AllValidParentheses();
        List<String> res = sol.allValidParen(3);
        System.out.println(res.toString());
    }

}
