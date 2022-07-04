public class MyHashMap {
    static class Node<String, Integer>{
           private Integer value;
           private String key;
           Node<String,Integer> nex;
           Node(String key, Integer value) {
               this.key = key;
               this.value = value;
           }
           public String getKey() {
               return key;
           }

           public Integer getValue() {
               return value;
           }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    //fields:

}
