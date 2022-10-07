import javax.xml.transform.SourceLocator;

public class JavaPractice1 
{
    public static void main(String[] args)
    {
        int numberofpeaches;
        short smallStack;
        Double priceOfpint = 7.97;
        Float weightofBiggestPeach = 5.2f;
//Cheatsheet for knowing what numerical data types to use
//Byte = 1 
//Short = 2 
//Int = 4 
//Float = 4
//long = 8 
//Double = 8
//Use an assignment symbol, equal sign for number values.
//Double cant go into a float type. "Cannot cast from double to float"
//int to double can work, but int to short has issues.
//Be sure to place smallstack AFTER the value is stated.
//Apply this to Chapter 2 HW
        weightofBiggestPeach = (float) priceOfpint;
        
        numberofpeaches =  45;
        weightofBiggestPeach = numberofpeaches;
        smallStack = (short) numberofpeaches;
        
        numberofpeaches = smallStack;
        
        System.out.println("There are this many peaches in the bin: " + numberofpeaches);
    }

}