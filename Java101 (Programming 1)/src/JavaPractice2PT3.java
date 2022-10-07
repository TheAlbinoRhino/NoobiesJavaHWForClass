//Printing Characters Using ASCII Value

//In the below example,  three char Java variables with the integers. Upon printing them, those integers will be converted into their ASCII equivalent. The compiler typecast integer to a character and then the corresponding ASCII value will be displayed.
public class JavaPractice2PT3 {
 
    public static void main(String[] args) {
         
        char c1, c2, c3;
         
        /*
         *  Since 65 and 67 are the ASCII value for A and C, 
         *  we have assigned c1 as 65 and c3 as 67.
         */
         
        c1 = 65;
        c2 = 'B';
        c3 = 67;
         
        System.out.println("The characters are: " + c1 + c2 + c3);
         
    }
 
}
//Output: The characters are: ABC