public class StackOverflow {

    public static void print(int x) {
        if (x <= 0) {
            return;
        }
        print(x-1);
        System.out.println(x);
    }
    public static void main(String[] args) {

       for(int i=0; i<10000000;i++) {
            System.out.println(i);
        }

    }
}
