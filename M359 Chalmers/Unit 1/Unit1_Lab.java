import java.util.Scanner;

public class Unit1_Lab
{
    
    public static void main (String[] args)
    {
        helper();
        
        String name;
        String food;
        String sport;
        String clubs;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\fWelcome to a short Personal Interest Survey");
        System.out.println("\nWhat is  your Name?\t");
        name = scan.nextLine();
        System.out.println("\nWhat is your favorite food?\t");
        food = scan.nextLine();
        
        int num;
        System.out.print("fav num?\t");
        num = scan.nextInt();
        System.out.print("\nReally? I love " +num + " too!");
    }
      
    public static void helper()
    {
        System.out.println("\fJack Chalmers\nM359\nPeriod 8\nAugust , 2016");
    }
    
}