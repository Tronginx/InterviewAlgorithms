import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L77Combinations {
    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0) {
            return null;
        }


        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        dfs(res, cur, 1, n, k);

        return res;

    }

    private void dfs(List<List<Integer>> res, List<Integer> cur, int startIndex, int n, int k){
        if (cur.size() == k ) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = startIndex; i <= n - (k - cur.size()) + 1; i++){
            cur.add(i);
            dfs(res, cur, i + 1, n, k);
            cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        int n  = 4;
        int k = 2;

        L77Combinations sol = new L77Combinations();
        String res = sol.combine(n,k).toString();

        System.out.println(res);

    }
}