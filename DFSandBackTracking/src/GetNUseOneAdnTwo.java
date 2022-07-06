import java.util.ArrayList;
import java.util.List;

public class GetNUseOneAdnTwo {

    public List<String> coins(int n) {
        if ( n <= 0) {
            return new ArrayList<String>();
        }

        int index = 0;
        int[] coins = new int[]{1,2};
        List<String> res = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        dfs(res, sb, coins, index, n);
        return res;
    }

    private void dfs( List<String> res, StringBuilder sb, int[] coins, int index, int n) {
        if (index == coins.length) {
            res.add(new String(sb));
            return;
        }

        int max = n / coins[index];
        for (int i = 0; i <= max; i++) {
            sb.append(i);
            dfs(res, sb, coins, index + 1,n - i * coins[index]);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


    public static void main(String[] args) {

        GetNUseOneAdnTwo sol = new GetNUseOneAdnTwo();

        List<String> res = sol.coins(3);

        System.out.println(res.toString());
    }

}
