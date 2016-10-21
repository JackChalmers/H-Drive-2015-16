import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class WorkSheet5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorkSheet5
{
    // instance variables - replace the example below with your own
    static String feeling;
    static int number;
    static boolean bcINeededTo;
    static String sport;
    

    public static void main()   throws IOException, FileNotFoundException
    {
        Scanner inF = new Scanner(new File("homework10-21-16.txt"));
        
        
        while(inF.hasNextLine())
        {
            feeling = inF.nextLine();
            number = inF.nextInt();
            inF.nextLine();
            bcINeededTo = inF.nextBoolean();
            inF.nextLine();
            sport = inF.nextLine();
        }
        
        System.out.println(feeling);
        System.out.println(number);
        System.out.println(bcINeededTo);
        System.out.println(sport);
    }

    
}
