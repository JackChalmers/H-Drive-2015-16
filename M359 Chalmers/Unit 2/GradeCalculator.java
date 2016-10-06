import java.util.Scanner;

public class GradeCalculator
{
    /*
     * Prompt user for their test grade percent
     * print outstatement with their letter grade
     */
    
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your test score");
        int percentage = scan.nextInt();
        
        if(percentage >= 90)
            System.out.println("You got an A!");
        else if(percentage >= 80)
            System.out.println("You got a B!");
        else if(percentage >= 70)
            System.out.println("You got a C");
        else if(percentage >= 60)
            System.out.println("You got a D...");
        else
            System.out.println("You failed");
        
        
        
    }
}