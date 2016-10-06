
/**
 * Example of a well written class
 * 
 * @author Jack Chalmers
 * @version 9/21/16
 */
public class BankAccount
{
    /*instance Fields*/
    private int pin;
    private double balance;
    private Address home;
    private String acctName;

    
    public BankAccount()
    {
        /**/
        pin = 0;
        balance = 0;
        acctName = "";
        home = new Address();     /*calling default constructor*/
    }

    public BankAccount(int pin, double balance, String acctName, Address adr)
    {
        this.pin = pin;
        this.balance = balance;
        this.acctName = acctName;
        home = adr;
    }
    
    public void printBalance()
    {
        System.out.println("your balance is: " + balance);
    }
    
    /*whenever an objects identifier (variable name) is printer
     * the toString() method is called automatically
     * EX:  BankAccount momsMoney = new BankAccount();
     *      System.out.print(momsMoney)
     */
    public String toString()
    {
        String str  = (acctName + "  " + balance);
        str += "\n" + home.toString();
        return str;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    /*
    public int getAcctNum()
    {
        return acctNum;
    }
    */
   
    public String getName()
    {
        return acctName;
    }
    
    public void setPin(int pin)
    {
        this.pin = pin;
    }
    
    public void setAcctName(String acctName)
    {
        this.acctName = acctName;
    }
    
    public void withdraw(double val)
    {
        if(balance > val)
            balance -= val;
        else
            System.out.println("insufficient funds");
    }
    
    public void deposit(double val)
    {
        balance += val;
    }
    
    public void setAddress(String addr, String city, String state, String zip)
    {
        home.setAddress(addr, city, state, zip);
    }
    
    public String getAddress()
    {
        return home.toString(); /*returns a string representation of the address*/
    }
}
