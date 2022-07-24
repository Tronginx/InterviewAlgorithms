import java.util.ArrayList;
import java.util.List;

public class a73CombinationsOfCoins {

    public List<List<Integer>> findCoins(int[] coins, int target) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (target <= 0 || coins == null || coins.length == 0) {
            return res;
        }

        List<Integer> cur = new ArrayList<>();

        backtracking(res, cur, coins, target, 0);
        return res;
    }

    private void backtracking(List<List<Integer>> res, List<Integer> cur, int[] coins, int target, int index) {
        if (index == coins.length - 1) {
            if (target % coins[index] == 0) { // why not use index here
                cur.add(target / coins[index]);
                res.add(new ArrayList<Integer>(cur)); // why needs initialization
                cur.remove(cur.size()-1);
            }
            return;
        }

        int max = target/coins[index];
        for (int i = 0; i <= max; i++) {
            cur.add(i);
            backtracking(res, cur, coins, target - (i * coins[index]), index + 1);
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
