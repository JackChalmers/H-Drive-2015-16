import java.util.Scanner;
/**
 * Write a description of class CellPhoneDriver here.
 * 
 * @author Jack Chalmers 
 * @version 10/3/16
 */
public class RPSDriver
{
    public static void main(String[] args)    
    {
        boolean playGame = true;
        Scanner in = new Scanner(System.in);
        RPS gameOne = new RPS();
        while(playGame == false)
        {
        System.out.println("Play Again? \n1. yes\n2. no");
        int input = in.nextInt();
        if(input == 1)
            playGame = true;
        else
        { 
            System.out.print("\f");
            System.out.print("Thanks For Playing!");
        }
        }
    }
}