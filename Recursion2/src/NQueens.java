import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public List<List<Integer>> nQueens(int n) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (n < 1) {
            return res;
        }
        List<Integer> cur = new ArrayList<>();

        dfs(res, cur, n);

        return res;


    }


    private void dfs(List<List<Integer>> res, List<Integer> cur, int n) {

        if (cur.size() == n) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValid(cur, i)) {
                cur.add(i);
                dfs(res, cur, n);
                cur.remove(cur.size() - 1);
            }
        }
    }

    private boolean isValid(List<Integer> cur, int column) {
        int row = cur.size();
        for (int i = 0; i < row; i++) {
            if (cur.get(i) == column || Math.abs(cur.get(i) - column) == row - i) {
                return false;
            }
        }
        return true;
    }

}
