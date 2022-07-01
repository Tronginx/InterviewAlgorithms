public class Accumulator2 {

        int s = 0;
        public void add (int x) {
            s += x;
        }
        public int sum() {
            return s;
        }

        public static void main(String[] args) {

            Accumulator2 accumulator = new Accumulator2();

            accumulator.add(5);
            accumulator.add(2);
            int res = accumulator.sum();
            System.out.println(res);


        }

}
