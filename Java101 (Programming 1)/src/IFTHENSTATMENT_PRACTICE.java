import java.util.Scanner;

public class IFTHENSTATMENT_PRACTICE 
{
    public static void main (String[]arg) 
    {
        try (Scanner keyboard = new Scanner (System.in)) 
        {
            double balance = 60;        //Balance stated
            double cheeseprice;              //Price of cheese that will be read via whatever price the user has typed.
            String cheeseName;          //type of cheese
                
            if (balance >= 80);
            { 
                System.out.println("What is the price of cheese? ");
                //Read the price, and have the user confirm the pricing.
                cheeseprice = keyboard.nextDouble();
                
                //ask what type of cheese is it?
                System.out.println("What kinda cheese is it? ");
                keyboard.nextLine();            //This is used as a bogus read to get rid of old enter key
                cheeseName = keyboard.nextLine();
                
                //Try to buy some cheese!
            if (balance >= cheeseprice) 
            {
                System.out.println("You have enough funds to buy the " + cheeseName + cheeseprice);
                balance = balance -80;  //Equation below to calulate if 80 dollars is present
            }
            else
            {
                System.out.println("You don't have enough to buy the cheese");
            }
                System.out.println("ending balance is: $" + balance);
            }
        }
    }
}