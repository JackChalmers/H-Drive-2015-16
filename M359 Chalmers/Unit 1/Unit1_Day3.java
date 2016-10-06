
/**
 * Class Exaples for Unit 1 Day 3
 * 
 * Topics include declaring, initializing and using variables
 * Arithmetic evaluation
 * Data conversions
 * 
 */
public class Unit1_Day3
{
    public static void main (String[] args)
    {
        // PART 1
        // Declare, initialize and use five different variables
        // You must create at least one char and one boolean
        // Use print statements to verify the values you assigned are correct
        // See the first two lines as an example of what  I am looking for
        
        System.out.println("\fPart 1");
        int age = 17;
        System.out.print("My age is: " + age);
         int memes = 9000;  
         boolean Strong = true;
         char midName = 'a';
         float moneyEarned = 1000; 
         double sotos = (12%13);
        
        System.out.println("\nmy memes are over " + memes + "\nMy middle initial is " + midName + "\ni make " + moneyEarned + " per day");
        
        
        // PART 2
        // Create two complicated arithmetic expressions and
        // Figure out what you think value will be.  Then compile 
        // to see if your soluion was correct.  See example below
        
        System.out.println("\n\nPart 2");
        double x = (5+6) / 4 + 3.2;        
        System.out.println("I think the value of x is 5.2 and the solution is: " + x);  
        
        double y = (12*(235%3))*12*3.14;
        System.out.println("I tink the answer to the equation is too long for me to solve so the answer is: " + y);
        
        /*
        // PART 3
        // 
        System.out.println("\n\nPart 3");
        double y = 5/4;
        double z = 5/4.0;
        double a = (double)5/4;
        double b = (double)(5/4);
        
        int c = 2;
        double d = c;

        
        System.out.println("Value of 5/4: is " + y); 
        System.out.println("Value of 5/4.0: is " + z);
        System.out.println("Value of (double)5/4: is " + a);
        System.out.println("Value of (double)(5/4): is " + b);   
        System.out.println("Value of c is: " + c + " and d is: " + d);
        System.out.println("\nNow talk with your neighbor about why you think this happened...");
        */
        
            
        
    }
}
