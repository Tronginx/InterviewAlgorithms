import java.util.ArrayList;
import java.util.List;

public class a73CombinationsOfCoins {

    public List<List<Integer>> findCoins(int[] coins, int target) {
        if (target == 0) {
            return new ArrayList<List<Integer>>();
        }

            int index = 0;
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> cur = new ArrayList<Integer>();
            dfs(cur, res, index, coins, target);
            return res;
        }

    private void dfs(List<Integer> cur, List<List<Integer>> res, int index, int[] coins, int target) {
            if (index == coins.length - 1) {
                if (target % coins[index] == 0) {
                    cur.add(target / coins[index]);
                    res.add(new ArrayList<Integer>(cur));
                    cur.remove(index);
                }
                return;
            }

            int max = target / coins[index];
            for (int i = 0; i <= max; i++) {
                cur.add(i);
                dfs(cur, res, index + 1, coins, target - i * coins[index]);
                cur.remove(cur.size() - 1);
            }

        }



        public static void main(String[] args) {
            int[] coins = new int[]{1,5,10,50};

            a73CombinationsOfCoins sol = new a73CombinationsOfCoins();
            List<List<Integer>> res = sol.findCoins(coins,170);

            for (int i = 0; i < res.size(); i++) {
                System.out.println(res.get(i).toString());
            }
    }
}
