public class BankAccountDriver
{
    public static void main()
    {
        header();
        
        // This shows the use of all three constructors
        
        BankAccount acct1 = new BankAccount("Shannon Denna");
        BankAccount acct2 = new BankAccount("Robert Denna", "Aubrey's College fund");
        BankAccount acct3 = new BankAccount("Brayden Denna", "Future Car Fund", 2000);
        
        // Display info for all accounts
        System.out.println(acct1.getAcctInfo());
        System.out.println(acct2.getAcctInfo());
        System.out.println(acct3.getAcctInfo());        
        
        // Add $200 to each account and then reprint
        acct1.deposit(200);
        acct2.deposit(200);
        acct3.deposit(200);
        
        // Display info for all accounts
        System.out.println(acct1.getAcctInfo());
        System.out.println(acct2.getAcctInfo());
        System.out.println(acct3.getAcctInfo());        
                
        //Demonstrate how to use the "get" methods when they return things
        int temp;
        temp = acct1.getAcctNum();       // store the returned value in a variable
        System.out.println("\nThe account number for " + acct1.getName() + " is " + temp);
        
        // another way to use the get methods
        System.out.println("\nThe account number for " + acct2.getName() + " is " + acct2.getAcctNum());
    }
    
    public static void header()
    {
        System.out.println("\fMrs. Denna\nBank Account Example\nAug, 31, 2016\n\n");
    }    
}