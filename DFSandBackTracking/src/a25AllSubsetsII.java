import java.util.ArrayList;
import java.util.List;

public class a25AllSubsetsII {
    public List<String> subSets(String set) {
        // Write your solution here.
        if (set == null){
            return null;
        }

        StringBuilder cur = new StringBuilder();
        List<String> res = new ArrayList<>();
        char[] input = set.toCharArray();
        int index = 0;
        dfs(input, cur, res, index);

        return res;
    }

    private void dfs(char[] input, StringBuilder cur, List<String> res, int index) {
        res.add( new String(cur) );
        for ( int i = index; i < input.length; i++ ) {
            // 跳过当前树层使用过的、相同的元素
            if ( i > index && input[i - 1] == input[i] ) {
                continue;
            }
            cur.append( input[i] );
            dfs(input, cur, res, index + 1 );
            cur.deleteCharAt(cur.length() - 1);
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        a25AllSubsetsII sol = new a25AllSubsetsII();
        List<String> res = sol.subSets(input);
        System.out.println(res.toString());
    }
}
