
/**
 * Class Exaples for Unit 1 Day 2
 * 
 * Topics include the difference between print and println
 * String concatenation vs addition
 * String literals and escape sequences
 * 
 */
public class Unit1_Day2
{
    public static void main (String[] args)
    {
        // PART 1
        // add text inside the " " to see the difference between 
        // print and println.  Try different things to test your theory
        
        System.out.println("\fPart 1");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print("3 ");
        
        System.out.println("4 ");
        System.out.println("5 ");        
        
        // PART 2
        // String concatenation vs addition
        // Try different things to test your theory
        System.out.println("\n\nPart 2");
        System.out.println("I love Java M" + 3 + 5 + 9);
        System.out.println("I love Java M" + (3 + 5 + 9));  
        
        // PART 3
        // String literals and escape sequences
        System.out.println("\n\nPart 3");
        System.out.println("Roses are red, \n\tViolets are blue,\n" +
            "Sugar is sweet,\n\t But I have \"commitment issues\", \n\t" +
        "So I'd rather just be friends \n\tAt this point in our " +
            "relationship.");

        // HOMEWORK    
            
        // PART 4
        System.out.println("6/8/00");
        
        System.out.println("Jack");
        System.out.println("Chalmers");
        // PART 5
        // Modify the code in Part 4 to print your first name, last name, 
        // and bday on different lines. 
            
        
    }
}
