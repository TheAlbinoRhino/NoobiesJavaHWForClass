/*
 * This program asks the user for the number of shares
 * the share price, 
 * and the percent commission
 * Kathryn bought 600 shares of stock at a price of $21.77 per share. 
 * She must pay her stock-broker
 * 2 percent commission for the transaction. 
 */

import javax.swing.JOptionPane;

public class Cht2StockAsker {
    
    public static void main(String[] args) {
        
        //Stock amount and pricing of stock Kat bought
        double stockTotal = 21.77*600;
        //Percentage of kates stock in double
        double stockflatcommission = 0.02 * stockTotal;
        //Stock total calculation
        double totalAmount = stockTotal + stockflatcommission;
        
        //Print out result shown
        JOptionPane.showMessageDialog(null, "Hello Kathryn! This is the stock cost calculation for [INSERT FORBES 100 COMPANY HERE]. You have paid $" + stockTotal + " for the shares (w/o commission added). For the cost of commission, you have paid $" + stockflatcommission + " . Making the total pricing is $" + totalAmount);
        System.exit( 0 );
        }
}