import java.util.Scanner;
import javax.swing.JOptionPane;
//A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking
//account:
//!$.10 each for less than 20 checks
//!$.08 each for 20–39 checks
//!$.06 each for 40–59 checks
//!$.04 each for 60 or more checks
//*Write a program that asks for the number of checks written for the month. The program should then
//*calculate and display the bank’s service fees for the month.

public class Chapter_3Program_2_NC 
{    
    public static void main(String[] args)
    {
        
        try (Scanner keyboard = new Scanner (System.in)) 
        {
            Double Fee = (double) 10.00;    //Bank check fee/month stated
            Double NoOfchecks;              //Number of checks. 
            //Selection of each price range, times the no. of checks

            Double Choice1;
            Double Choice2;
            Double Choice3;
            Double Choice4;
            
            //Tiers = The pricing depending on NoOfchecks used
            Double Tier1 = 0.10;
            Double Tier2 = 0.08; 
            Double Tier3 = 0.06;
            Double Tier4 = 0.04; 
            
            System.out.println("What is the number of check do you have? ");
                //Read the price, and have the user confirm the pricing.
                NoOfchecks = keyboard.nextDouble();
                
                keyboard.nextLine();            //This is used as a bogus read to get rid of old enter key
            //How choice calculates the output
            Choice1 = Tier1 * NoOfchecks;
            Choice2 = Tier2 * NoOfchecks;
            Choice3 = Tier3 * NoOfchecks;
            Choice4 = Tier4 * NoOfchecks;
            //If Else Formula!
            if (NoOfchecks <=60 ){ 
                System.out.println("The cost of your checks is " + Choice4 + Fee);
            }
            else if (NoOfchecks >=59){
                System.out.println("The cost of your checks is " + Choice3 + Fee);
            }
            else if (NoOfchecks >=39){
                System.out.println("The cost of your checks is " + Choice2 + Fee);
            }
            else{
                System.out.println("The cost of your checks is " + Choice1 + Fee);
            }
        }
    }
}
