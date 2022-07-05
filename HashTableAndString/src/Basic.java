import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basic {
    public Map<String, Integer> dict(String[] input) {


        Map<String, Integer> map = new HashMap<>();

        for(String x : input) {
            Integer value = map.get(x);
            if (value == null) {
                map.put(x,1);
            } else {
                map.put(x, value + 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        String[] input = new String[]{"abc","abc","a"};

        Basic instance = new Basic();

        Map<String,Integer> map = instance.dict(input);


        //[abc, 2]
        //[a, 1]
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }
    }

}
