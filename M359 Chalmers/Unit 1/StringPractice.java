public class StringPractice
{
    public static void main()
    {
        header();
        String str = "Free Nachos today!";
        System.out.println("The length of str is: " + str.length());
        System.out.println(str.substring(5,10));
        //str = str.toUpperCase();
        System.out.println(str);
        str = str.replace('N', 'n');
        System.out.println(str);
        
        
        int total = 800;    // totalt test points
        int num = 9;      // number of tests
        
        
        System.out.println(avg(total, num));
        
        
    }
    
    public static double avg(int totalScores, int numScores)
    {
        return (double)totalScores/numScores;
    }
    
    
    
    public static void header()
    {
        System.out.println("\fJack Chalmers\nM359\nPeriod 8\nAug 22nd. 2016");
    }
}