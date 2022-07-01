import java.util.Random;

public class BoundedRandom {

    public static void main(String[] args) {
        Random rand = new Random();

        for(int i=0;i<50;i++) {
            int num = 1 + rand.nextInt(2 - 1 + 1);
            System.out.println(num);
        }

    }
}
