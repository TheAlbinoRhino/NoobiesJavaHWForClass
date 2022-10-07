import java.util.Scanner;
import javax.swing.JOptionPane;

public class Assignment103
{
    public static void main(String[] args) {
        
    {
        try (Scanner keyboard = new Scanner (System.in)) 
        //!Need to park car for 4 hrs.
        //!Has to know how many quarters the meter needs
        // 0.25 cents/hr
        // For 4hrs, that would be 2 Dollars in total (or 8 quarters)
        // Give a yes or no on, if the user can park there
        //*In addition to showing how many quarters they have left, if you park or don't park. */
        {
            int balance = 8;        //Balance stated. 8 quarters is needed to park for 4 hours
            int quarters = 1;        //Value of a Quarter (in relation to how many is needed. Not the actual value of a quarter)
            int balance_given;          //Equation of balance stated, and quarters given
            
            int AmountLeft;              //Amount of quarters left.
            
                
            if (balance <= 8);
            { 
                System.out.println("how much quarters do you have? ");
                //Read the price, and have the user confirm the pricing.
                quarters = (int) keyboard.nextDouble();
                
                //Try to buy some cheese!
            if (AmountLeft <= balance) 
            {
                System.out.println("You have enough funds to buy the meter! The amount left is" + AmountLeft);
                balance_given = balance - quarters;  //Equation below to calculate if 80 dollars is present
                AmountLeft = balance - balance_given;
            }
            else
            {
                System.out.println("You don't have enough for the meter! The amount needed is" + AmountLeft);
            }
                System.out.println("ending balance is: $" + balance);
            }
        }
    }
}