//JOptionPane Gives the user a dialog box
//* Like many things, it needs:
//! import javax.swing.JOptionPane;
//! JOptionPane.showInputDialog("Enter your name");
//! JOptionPane.showMessageDialog("Enter your name");

import javax.swing.JOptionPane;
public class JavaJOPTIONLesson 
{
public static void main(String[] arg)
    {
    //! Shows message in box
    //! The null function shows a straight up message with no options
    JOptionPane.showMessageDialog(null, "Unhand the object, or accept evisceration");
    
    // Ask user a question
        String name = JOptionPane.showInputDialog("Now, who are you?");
    //! AddString double for numerical input from user, then 'str' for the println
        double number;
            String str = JOptionPane.showInputDialog("Okay " + name + ". Now tell me, how many pizza slices you would like? :)");
        System.out.println("Number is " + str);
    //Convert str into a number
    //! Add double to make sure decimal inputs can be inputted!
        number = Double.parseDouble(str);
    //! Parse number with ++, since ++ adds to 1 
        number++;
    //show the app I can eat more than 1 slices
        JOptionPane.showMessageDialog(null, "Dope! you have a really big mouth to fit in that many! I got an even bigger mouth to fit in "+ number + " slices of pizzas lmao!");
        
    //! Use System.exit(0); for dialogue cleanup
    System.exit(0);
    }

}