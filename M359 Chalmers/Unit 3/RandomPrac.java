import java.util.Random;
public class RandomPrac
{
    /**
     * This class is for review of the random class and how to use it
     */
    public static void main()
    {
        //Review Section
        
        // Recall we must make an object of Random to use its methods
        Random rnd = new Random();
        System.out.print("\f");
        
        // Also recall that when using the nextInt() method of Random, the int parameter
        // is exclusive. So in this case it will print a random number from 0 to 99.
        System.out.println(rnd.nextInt(100));
        
        // Also remember that in order to print a random number from a non zero number to 
        // another number you must do an operation such as this. The range for this statement
        // is [10,109]
        System.out.println(10 + rnd.nextInt(100));
        
        //Practice Section
        
        // Write a statement that will print a number from 0 to 200
        System.out.println(rnd.nextInt(201));
        
        // Write a statement that will print a number in this range: (0,100)
        System.out.println(rnd.nextInt(101));
        
        // Write a statement that will print a number from 25 to 150
        System.out.println(25 + rnd.nextInt(126));
        
        // Write a statement that will print a number from -10 to -199
        System.out.println(-1*(10 + rnd.nextInt(190)));
        
        // Write a statement that will print a random decimal from 0 to 1 that goes to the hundreths place
        System.out.println((double) rnd.nextInt(101)/100);
    }
}
