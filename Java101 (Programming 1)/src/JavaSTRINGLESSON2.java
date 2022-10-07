import java.util.Scanner;
public class JavaSTRINGLESSON2 
{
    public static void main(String[] args)
    {
        try (Scanner keyboard = new Scanner(System.in)) {
            //Promt user for their favorite food
            System.out.print("What is your favorite food?");
            //Read the string the user types
            //Use common phrases!
            String answer;
            answer = keyboard.nextLine();
            //No parameters '()'. Allows a person to type in a input
            System.out.println("Yummy! I like" + answer + " too.");
        }
    }
}
