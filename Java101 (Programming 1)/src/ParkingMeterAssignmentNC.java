import java.util.Scanner;
import javax.swing.JOptionPane;

public class ParkingMeterAssignmentNC
{
    public static void main(String[] args) 
    {
        
        
        try (Scanner keyboard = new Scanner (System.in)){ 
        //!Need to park car for 4 hrs.
        //!Has to know how many quarters the meter needs
        // 0.25 cents/hr
        // For 4hrs, that would be 2 Dollars in total (or 8 quarters)
        // Give a yes or no on, if the user can park there
        //*In addition to showing how many quarters they have left, if you park or don't park. */
        
            Double balance = 8.00;        //Balance stated. 8 quarters is needed to park for 4 hours
            int quarters = 1;        //Value of a Quarter (in relation to how many is needed. Not the actual value of a quarter)
            Double balance_given;          //Equation of balance stated, and quarters given
            Double Amount_Left;              //Amount of quarters left.
            
            balance_given = balance - quarters;  //Equation below to calculate if 8 quarters is present
            Amount_Left = balance - balance_given; 
                //Input from user 
                JOptionPane.showInputDialog("how much quarters do you have?");

                //Read the price, and have the user confirm the pricing.
                quarters = (int) keyboard.nextDouble();
                if (quarters >= 8){
                JOptionPane.showMessageDialog(null, "You have enough funds to buy the meter! The amount left is " + Amount_Left);
                }

                else if (quarters < 8){
                JOptionPane.showMessageDialog(null, "You don't have enough for the meter! The amount needed is" + Amount_Left);
                }
            System.exit(0);
        }
        
    }
}