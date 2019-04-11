import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;
public class TacoBoi {
   private static String userEntry;

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);


        System.out.println( "Welcome to Delgados Tacos!" );
        tacoTruck();
        System.out.println( "Would you like to see the menu?" );
        userEntry = myObj.nextLine();
        if(userEntry.toLowerCase().equals( "yes" )){
            MenuOptions();
        }
        if(userEntry.toLowerCase().equals( "no" )){
            System.out.println( "Then why are you here?" );
        }




    }

    private static void tacoTruck(){
        System.out.println( "____________________________" );
        System.out.println( "|                            |" );
        System.out.println( "|    Taco Truck              |" );
        System.out.println( "|                            |" );
        System.out.println( "|                             |___________" );
        System.out.println( "|                                        |" );
        System.out.println( "|                                        |" );
        System.out.println( "|      ____               ___            /" );
        System.out.println( "|_____|  O  |____________|  O |_________/" );
    }



    private static void MenuOptions()
    {
        System.out.println("Menu ");
        System.out.println("Main Meals:");
        System.out.println("World Famous Tacos: 1.50$ per taco");
        System.out.println("Bean Bursting Burritos: 2.50$ per Burrito");
        System.out.println("Tasty Taco Salad: 3.50$ for 1/2 and 5.00$ for full");
        System.out.println("Drinks:");
        System.out.println("Water");
        System.out.println("Pop");
    }

    private static void UserOrder() {
        double taco = 1.50;
        double burrito = 2.50;
        double tacoSaladHalf = 3.50;
        double tacoSaladFull = 5;
        double water = 1.25;
        double pop = 1.75;
        double totalNoTax = (taco + burrito + tacoSaladFull + tacoSaladHalf + tacoSaladFull + water + pop);
        double totalWithTax = totalNoTax * 1.07;
    }

}
