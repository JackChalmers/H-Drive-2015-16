import java.util.Random;

public class BankAccount
//class header

{
    // instance fields are the data for each BankAccount object
    // these are private to protect the data
    
    
    //instance fields. private to protect data
    private String name;            // name of account holder
    private String acctNickName;    // nickname for account (College fund, New car savings, etc.)
    private double balance;         // this current amount of money in the account
    private int accountNum;         // account number that is randomly generated 

    
    // constructor - this ---method--- is called ----whenever a new BankAccount object is made---- 
    // The constructor has --NO return type-- and always has the --same name-- as the class
    // You can --create multiple constructors-- to give the user many ways to create the new object
    
    
    // This constructor only receives the name of the person setting up the account.
     public BankAccount(String aName)
    {
        name = aName;
        acctNickName = "";
        balance = 0;
        Random g = new Random();
        accountNum = g.nextInt(1000);       // generates a random acct number between [0,1000)
    }
   
    
    //This constructor has the name of account holder and nickname
        public BankAccount(String aName, String anAcctNickName)
    {
        name = aName;
        acctNickName = anAcctNickName;
        balance = 0;
        Random g = new Random();
        accountNum = g.nextInt(1000);       // generates a random account number from [0,1000)
    }
   
    // This constructor has account holder name, nickname, and a starting balance
    public BankAccount(String aName, String anAcctNickName, double aBalance)
    {
        name = aName;
        acctNickName = anAcctNickName;
        balance = aBalance;
        Random g = new Random();               // g can call methods in random class
        accountNum = g.nextInt(1000);       // generates a random account number from [0,1000)
    }
    
    // Access Methods - these methods allow the calling 
    // program to obtain private data fields
    //string = type of value it is returning
    //each method can only return one thing
    
    public String getName()
    {
        return name;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String getNickName()
    {
        return acctNickName;
    }
    
    public int getAcctNum()
    {
        return accountNum;
    }
    
    // Mutator or "set" methods - these methods allow the calling 
    // program to change or modify the private data fields
    public void setNickName(String newName)
    {
        acctNickName = newName;
    }
    
    public void deposit(double num)
    {
        balance = balance + num;
        System.out.println("Thank you for depositing $" + num + " into " + name + "'s account");
    }
    
    public void withdraw(double num)
    {
        balance = balance - num;
    }
    
    public String getAcctInfo()
    {
        String str = "\nAccount holder's name:\t\t"+ name;
        str += "\nAccount nickname:\t\t" + acctNickName;
        str += "\nAccount Number:\t\t\t" + accountNum;
        str += "\nAccount balance:\t\t" + balance;
        
        return str;     // Note you could also make this method void and 
                        // then print str within the method.
    }
}
