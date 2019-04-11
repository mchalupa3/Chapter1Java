import java.util.Random;

public class RandNum {
    public static void main(String[] args){



        Random rand = new Random();

        int n = rand.nextInt(50);


        n += 1;

        System.out.println( n );

    }
}
