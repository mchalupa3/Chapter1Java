import java.util.Random;
import java.util.Scanner;

public class RandNum {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );



        Random rand = new Random();

        int n = rand.nextInt(11);


        n += 1;

        System.out.println( "Guess a number 1-10" );
        int randNumGuess = scan.nextInt();
        if(randNumGuess == n ){
            System.out.println( "Correct!" );
        }
        else{
            System.out.println( "You suck the number was " + n );
        }

    }
}
