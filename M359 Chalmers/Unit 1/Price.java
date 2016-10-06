
/***************************************************************************
 * Price.java
 * 
 * Demonstrates the use of various Scanner and NumberFormat methods
 **************************************************************************/

import java.util.Scanner;
import java.text.NumberFormat;


public class Price
{
    public static void main(String[] args)
    {
        final double TAX_RATE = 0.06;
        
        int quantity;
        double subtotal, tax, totalCost, unitPrice;
        Scanner scan = new Scanner(System.in);
        System.out.print("\fEnter the quantity: ");
        quantity = scan.nextInt();
        
        System.out.print("Enter the unit price: ");
        unitPrice = scan.nextDouble();
        
        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;
        
        //Print output iwth appropriate formatting
        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        System.out.println("Subtotal: " + money.format(subtotal));
        System.out.println("Tax: " + money.format(tax)+" at "
                            + percent.format(TAX_RATE));
        System.out.println("Total: " + money.format(totalCost));
        
        
        // Additional ways to use the NumberFormat class
        NumberFormat hundredths = NumberFormat.getNumberInstance();
        hundredths.setMinimumFractionDigits(2);
        hundredths.setMaximumFractionDigits(2);
         
        System.out.println("\n\nSubtotal: \t$" + hundredths.format(subtotal));
        System.out.println("Tax: \t\t$" + hundredths.format(tax) + " at " + 
            hundredths.format(TAX_RATE*100) + "%");
        System.out.println("Total: \t\t$" + hundredths.format(totalCost));

        

    }
}
