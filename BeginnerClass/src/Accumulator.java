import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class Accumulator {
    List<Integer> nums = new LinkedList<Integer>();
    public void add(int x) {
        nums.add(x);
    }
    public int sum() {
        int res = 0;
        for(int entry:nums){
            res += entry;
        }
        return res;
    }

    public static void main(String[] args) {

        Accumulator acm = new Accumulator();
        acm.add(9);
        acm.add(1);
        int res = acm.sum();

        System.out.println(res);

    }
}