import java.util.ArrayList;
import java.util.List;

public class AllPermutationsOfIfStatement {
    public List<String> allValidIfs(int n) {
        List<String> res = new ArrayList<String>();
        if (n < 1) {
            return res;
        }

        StringBuilder cur = new StringBuilder();
        int leftAdded = 0;
        int rightAdded = 0;

        dfs(res, cur, n, leftAdded, rightAdded);

        return res;

    }

    private void dfs(List<String> res, StringBuilder cur, int n, int leftAdded, int rightAdded) {

        if (leftAdded == n && rightAdded == n) {
            res.add(new String(cur));
            return;
        }

        int len = cur.length();
        if (leftAdded < n) {
            cur.append("if {  \n");
            dfs(res, cur, n, leftAdded + 1, rightAdded);
            cur.setLength(len);
        }

        if (rightAdded < leftAdded) {
            cur.append("}\n");
            dfs(res, cur, n, leftAdded, rightAdded + 1);
            cur.setLength(len);

        }




    }

    public static void main(String[] args) {
        AllPermutationsOfIfStatement sol = new AllPermutationsOfIfStatement();
        List<String> res = sol.allValidIfs(2);

        System.out.println(res.toString());
    }
}
