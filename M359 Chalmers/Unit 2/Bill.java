import java.util.Scanner;
/**
 * Write a description of class Bill here.
 * 
 * @author Jack Chalmers
 * @version (9-12-16)
 */
public class Bill
{
    /*instance variables - replace the example below with your own*/
    private String groupName;
    private int numAdults;
    private int numChilds;
    private boolean isBooster;
    private int foodChoice;
    private String boosterChoice;
    private int initialDeposit;
    
    
    
    
    
    /*CONSTANTS
    price of food, tax, room fee, gratuity, 
    */
    
    /*room size limits*/
    final double JIMMY_J = 5.00;
    final double TRE_A = 9.00;
    final double OLIVE_G = 15.00;
    final double TAX_RATE = .0325;
    final double GRATUITY_RATE = .18;
    final double CHILD_DISCOUNT = .6;
    final double BOOSTER_DISCOUNT = .1;
    
    final int ROOM_CLASS = 200;
    final int ROOM_MEDIA = 350;
    final int ROOM_AUDIT = 550;
    final int ROOM_CAFE = 700;
    final int ROOM_GYM = 1000;
    
    

    /**
     * Constructor for objects of class Bill
     */
    public Bill()
    {
        /*initialise instance variables*/
        groupName = "";
        numAdults = 0;
        numChilds = 0;
        foodChoice = 0;
        boosterChoice = "";
        initialDeposit = 0;
        isBooster = false;
        
        
        
    }

    /**
     * takeReservation prompts the user for the details and stores
     * them in the instance fields
     * 
     * @param       none
     * @return      none
     */
    public void takeReservation()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("\fWhat is Your Group Name?");
        groupName = scan.nextLine();
        System.out.println("\nHow Many Adults?");
        numAdults = scan.nextInt();
        System.out.println("\nHow Many Children?");
        numChilds = scan.nextInt();
        System.out.println("\nWhat Catering Package Would You Like?\n1. Jimmy Johns\n2. Tre Amici\n3. Olive Garden");
        foodChoice = scan.nextInt();
        System.out.println("\nDeposit? (0 if youre not making a deposit)");
        initialDeposit = scan.nextInt();
        System.out.println("\nAre You a Member of a Booster Club?(yes/no)");
        boosterChoice = scan.nextLine();
        if(boosterChoice.equalsIgnoreCase("yes"))
            isBooster = true;
        else 
            isBooster = false;
        
    }
    
    /**
     * calculateBill creates the bill with users input
     * 
     * @param       none
     * @return      none
     */
    public void calculateBill()
    {
        double subTotal = 0;
        int totalPeople = numAdults + numChilds;
        
        /*adds ammount of room cost to subtotal*/
        if(totalPeople <=30)
            subTotal +=ROOM_CLASS;
        else if(totalPeople <=75)
            subTotal +=ROOM_MEDIA;
        else if(totalPeople <=200)
            subTotal +=ROOM_AUDIT;
        else if(totalPeople <=500)
            subTotal +=ROOM_CAFE;
        else
            subTotal +=ROOM_GYM;
            
        if(foodChoice == 1)
            subTotal += JIMMY_J * numAdults + CHILD_DISCOUNT * JIMMY_J *numChilds;
        else if(foodChoice == 2)
            subTotal += TRE_A * numAdults + CHILD_DISCOUNT * TRE_A *numChilds;
        else 
            subTotal += OLIVE_G * numAdults + CHILD_DISCOUNT * OLIVE_G * numChilds;
            
        subTotal += TAX_RATE * subTotal;    
        
        subTotal += GRATUITY_RATE * subTotal;
       
        if(isBooster)
            subTotal -= subTotal * BOOSTER_DISCOUNT;
            
        subTotal -= initialDeposit;
            
    }
    
    /**
     * displayBill displays the bill with users input
     * 
     * @param       none
     * @return      none
     */
    public void displayBill()
    {
        System.out.println();
        
    }
}
