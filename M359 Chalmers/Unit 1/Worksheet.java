import java.util.Scanner;
import java.text.NumberFormat;

public class Worksheet
{
    //-----------------------------------------------------------------
    //  Reads a character string from the user and prints it
    //-----------------------------------------------------------------
    
    public static void main (String[] args)
    {
        String message;
        Scanner scan = new Scanner(System.in);
        System.out.println("\fI will find the distance between two points");
        
        int x1, y1, x2, y2;
        double ans;
        System.out.print("Enter Points for calculation\nX1\t");
        x1 = scan.nextInt();
        System.out.print("\nY1:\t");
        y1 = scan.nextInt();
        System.out.print("\nX2:\t");
        x2 = scan.nextInt();
        System.out.print("\nY2:\t");
        y2 = scan.nextInt();
        
        ans = Math.sqrt((Math.pow((x2-x1),2)+ Math.pow((y2-y1),2)));
        System.out.println("the distance from (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is: " + ans); 
        
        NumberFormat thousandths = NumberFormat.getNumberInstance();
        thousandths.setMinimumFractionDigits(3);
        thousandths.setMaximumFractionDigits(3);
        
        System.out.println("Rounded Distance : " + thousandths.format(ans));
    }
       
    
}