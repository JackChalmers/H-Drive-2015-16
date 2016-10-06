
/**
 * Echo.java
 * 
 * Demonstrates the use of the nextLine method of the Scanner class
 * to read a string from the user.
 */

import java.util.Scanner;

public class Echo
{
    //-----------------------------------------------------------------
    //  Reads a character string from the user and prints it
    //-----------------------------------------------------------------
    
    public static void main (String[] args)
    {
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.println("\fEnter your nickname");
        message = scan.nextLine();
        System.out.println("\nHey " + message + "!\nYou are a lord!");  
        
        int num;
        System.out.print("fav num?\t");
        num = scan.nextInt();
        System.out.print("\nReally? I love " +num + " too!");
    }
       
    
}
