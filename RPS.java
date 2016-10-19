import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class RPS here.
 * 
 * @author Jack Chalmers 
 * @version 10/3/16
 */
public class RPS
{
    // instance variables
    private final int ROCK = 1;
    private final int PAPER = 2;
    private final int SCISSORS = 3;
    
    private String playerName;
    private int playerChoiceNum;
    private int playerChoice;
    private String playerChoiceWord;
    private int compChoiceNum;
    private int compChoice;
    private String compChoiceWord;
    
    private int playerWins;
    private int compWins;
    
    public boolean playAgain;

    
    /**
     * Constructor for objects of class RPS
     */
    public RPS()
    {
        // initialise instance variables
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! Welcome to a game of Rock, Paper, Scissors! \nWhat is your name?");
        playerName = in.nextLine(); 
        
        gameplay();
        
            
        System.out.println(playerChoiceWord);
        System.out.println(compChoiceWord);
    }

    /**
     * Creates the randomly generated number for the computers choice in the game
     * 
     * @param      none
     * @return     the computers choice 
     */
    public void genCompNum()
    {
        Random rnd = new Random();
        compChoiceNum = (1 + rnd.nextInt(4));
    }
    
    /**
     * Reduce code length for player win round
     * 
     * @param      none
     * @return     none 
     */
    public void playerWinRound()
    {
        playerWins++;
        System.out.println("Player Wins");
    }
    
    /**
     * Reduce code length for player lose round
     * 
     * @param      none
     * @return     none 
     */
    public void playerLoses()
    {
        compWins++;
        System.out.println("Computer Wins");
    }
    
    /**
     * Reduce code length for player tie round
     * 
     * @param      none
     * @return     none 
     */
    public void gameTie()
    {
        System.out.println("Round Draw");
    }
    
    /*
     * Player wins after 5 rounds
     * 
     * @ param      none
     * @ return     none
     */
    public void gameOverP()
    {
        System.out.println("\fYou win! Congratulations! Play Again?\n1. Yes\n2. No");
        
    }
    
    /*
     * computer wins after 5 rounds
     * 
     * @ param      none
     * @ return     none
     */
    public void gameOverC()
    {
        System.out.println("\fYou lose! Better luck next time! Play Again?\n1. Yes\n2. No");
        
    }
    
    /*
     * this controlls the gameplay of the RPS
     * 
     * @param       none
     * @return      none
     */
    public void gameplay()
    {
        while(playerWins != 5 || compWins !=5)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("What hand do you want to play?\n1. Rock\n2. Paper\n3. Scissors");
            playerChoiceNum = in.nextInt();
            if(playerChoiceNum == ROCK)
                playerChoiceWord = "Rock";
            else if(playerChoiceNum == PAPER)
                playerChoiceWord = "Paper";
            else if(playerChoiceNum == SCISSORS)
                playerChoiceWord = "Scissors";
           
            genCompNum();
            if(compChoiceNum == ROCK)
                compChoiceWord = "Rock";
            else if(compChoiceNum == PAPER)
                compChoiceWord = "Paper";
            else if(compChoiceNum == SCISSORS)
                compChoiceWord = "Scissors";
                
                
            if(playerChoiceNum == ROCK && compChoiceNum == SCISSORS)
                {
                    playerWinRound();
                }
            else if(playerChoiceNum == PAPER && compChoiceNum == ROCK)
                {
                    playerWinRound();
                }
            else if(playerChoiceNum == SCISSORS && compChoiceNum == PAPER)
                {
                    playerWinRound();
                }
            else if(playerChoiceNum == compChoiceNum)
                gameTie();
            else
                playerLoses();
            
            if(playerWins == 5)
                {
                    gameOverP();
                    break;
                }
            else if(compWins ==5)
                {
                   gameOverC();
                   break;
                }
                
        }
        
        
    }
    
}
