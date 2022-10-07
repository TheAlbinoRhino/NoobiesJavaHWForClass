
//Final double package PACKAGE-PRICE = 94 e.g
//! Use full command above for software sales challenge

import javax.swing.JOptionPane;
public class Chapter4Notes {
    public static void main(String[] args) 
    {
        String userInput;   // something to hold user input
        String result; //shows results
        int quantity;   // number of packages the user buys

        //Discount Calculation for else if statement
        Double totalBeforeDiscount; 
        Double totalAfterDiscount;  
        Double discount;

        final double PACKAGE_PRICE = 99;

        // ask the user for quanity
        userInput=JOptionPane.showInputDialog("How many packages are you purchasing?");

        //Needs to be a numberic value
        quantity = Integer.parseInt(userInput);

        //determine the discount, if any
        if (quantity <= 0)
        {
            //totalBeforeDiscount = PACKAGE_PRICE * quantity * 0; would give A RESULT OF ZERO,
            //! What needs to be done is removing the zero, & adding the totalAfterDiscount double.
            //*afterwords, use else if, if input changes */
            totalBeforeDiscount = PACKAGE_PRICE * quantity;
            totalAfterDiscount = PACKAGE_PRICE * quantity;
        else if (quantity < 20)
        {
            totalBeforeDiscount = PACKAGE_PRICE * quantity;
            discount = PACKAGE_PRICE * quantity * 0.3;
        }   
        
        else if (quantity < 20)
        {
            totalBeforeDiscount = PACKAGE_PRICE * quantity;
            discount = PACKAGE_PRICE * quantity * 0.4;
        }   
        else if (quantity < 20)
        {
            totalBeforeDiscount = PACKAGE_PRICE * quantity;
            discount = PACKAGE_PRICE * quantity * 0.5;
        }   
        //calculate the price after discount
        totalAfterDiscount = totalBeforeDiscount - discount;

        //Display Results, $,.2f is the very funky looking format for displaying price.
        result = String.format("You have Saved $,.2f\nyour price $,.2f", 
        discount, totalAfterDiscount);

        JOptionPane.showMessageDialog(null, result);

        System.exit(0);
    }
}