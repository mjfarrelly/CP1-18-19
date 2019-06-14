import java.util.Scanner;
import java.util.Random;

public class Dice{
	public static void main(String[] args){
Scanner kin= new Scanner(System.in);
Random rand = new Random();
        String choice = "y";
        while(choice.equals("y")){
            System.out.println("Rolling two dice");


            int Die1 = rand.nextInt(6);
            Die1= Die1+1;
            System.out.println(Die1);
	
            int Die2 = rand.nextInt(6);
            Die2= Die2+1;
            System.out.println(Die2);
            int Die3 = Die1 + Die2;

            System.out.println("Die 1: " + Die1 +", Die 2: " + Die2+ ", sum of two dice: " + Die3 );

            System.out.print("Would you like to roll again? (y/n) ");
            String choice = kin.next();
                   if(choice.equals("n")){
                        System.out.println("Goodbye");}
        }

}
}
