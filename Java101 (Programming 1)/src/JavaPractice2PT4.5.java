public class JavaPractice2PT4 
{
    public static void main (String[]arg)
    {
        double regularWages; // The calculated regular wages.
        double basePay = 25; // The base pay rate.
        double regularHours = 40; // The hours worked less overtime.
        double overtimeWages; // Overtime wages
        double overtimePay = 37.5; // Overtime pay rate
        double overtimeHours = 10; // Overtime hours worked
        double totalWages; // Total wages

        regularWages = basePay * regularHours;
        overtimeWages = overtimePay * overtimeHours;
        totalWages = regularWages + overtimeWages;
        System.out.println("Wages for this week are $" + totalWages);    
    }
}
//Wages for this week are $1375.0
    