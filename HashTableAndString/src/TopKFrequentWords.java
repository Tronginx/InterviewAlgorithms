import java.util.*;

//My version
public class TopKFrequentWords {
    public static String[] findTopK(String[] input, int k){


        if (input == null || input.length == 0 || k < 1){
            return new String[0];
        }

        Map<String, Integer> map = new HashMap<>();

        for (String entry : input) {
            Integer freq = map.get(entry);
            if (freq == null) {
                map.put(entry, 1);
            } else {
                map.put(entry, freq + 1);
            }
        }

        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<Map.Entry<String,Integer>>(k, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2){
                if (e1.getValue().equals(e2.getValue())){
                    return 0;
                }
                return e1.getValue() < e2.getValue() ? -1 : 1;
            }
        });

        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (minHeap.size() < k) {
                minHeap.offer(entry);
            } else if (minHeap.peek().getValue() < entry.getValue()) {
                minHeap.poll();
                minHeap.offer(entry);
            }

        }

        if (k >= map.entrySet().size()) {
            String[] res = new String[map.entrySet().size()];
            for (int i = map.size()-1; i >= 0; i--) {
                res[i] = minHeap.poll().getKey();
            }
            return res;
        }

        String[] res = new String[k];
        for (int i = k-1; i >= 0; i--) {

            res[i] = minHeap.poll().getKey();
        }

        return res;

    }


    //-----------------------------------------------------------------------------

    //Laicode version:
    public static String[] topKFrequent(String[] combo, int k)	{

        if (combo.length == 0) {
            return new String[0];
        }

        Map<String, Integer> freqMap = getFreqMap(combo);

        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2){
                return e1.getValue().compareTo(e2.getValue());
            }
        });

        for(Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(entry);
            } else if (minHeap.peek().getValue() < entry.getValue()) {
                minHeap.poll();
                minHeap.offer(entry);
            }
        }

        return freqArray(minHeap);

    }

    public static String[] freqArray(PriorityQueue<Map.Entry<String, Integer>> minHeap) {

        String[] res = new String[minHeap.size()];
        for (int i = minHeap.size() - 1; i >= 0; i--) {
            res[i] = minHeap.poll().getKey();
        }

        return res;


    }



    public static Map<String,Integer> getFreqMap(String[] combo) {
        Map<String, Integer> freqMap = new HashMap<>();

        for (String s : combo) {
            Integer freq = freqMap.get(s);
            if (freq == null) {
                freqMap.put(s, 1);
            } else {
                freqMap.put(s, freq + 1);
            }
        }
        return freqMap;
    }








    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] input = new String[]{"d","a","c","b","d","a","b","b","a","d","d","a","d"};

        String[] res = findTopK(input, 5);
        String[] res2 = topKFrequent(input,5);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res2));



    }
}