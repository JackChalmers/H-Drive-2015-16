import java.util.Scanner;

public class FremdAfterDark
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        boolean takeOrder = true;
        String more = "";
        System.out.println("\f");
        
        while (takeOrder)
        {
            Bill order = new Bill();
            order.takeReservation();
            order.calculateBill();
            order.printBill();
            
            // prompt for additional orders - exit if enter "no"
            System.out.print("Do you have another order to place? Enter Yes or No:\t");
            more = scan.nextLine();
            
            if (more.equalsIgnoreCase("no"))
                takeOrder = false;          
        }
        
        System.out.println("\n\nThank you for using Fremd After Dark!  We appreciate your support!"); 
    }
}
