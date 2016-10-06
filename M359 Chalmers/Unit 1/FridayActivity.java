import java.util.Scanner;

public class FridayActivity
{
    /* 
     * Once you run this program all of the statements wil not be printed. You must hit ENTER
     * in order to advance the program. (That is what the scanner is doing - you do not need to know how it works) 
    **/
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        
        char j = 'J';
        char a = 'A';
        char v = 'V';
        
        String sentence = (Character.toString(j)) + (Character.toString(a)) + (Character.toString(v)) + (Character.toString(a));
        String str = "AP Java is fun";
        
        System.out.print("\f");
        
        // Part 1: What is the difference in output between these two print statements?
        
        System.out.print(sentence);
        
        scanner.nextLine();
        System.out.print("sentence");
        
        
        // Part 2: String Methods - Try to figure out what the output will be
        
        scanner.nextLine();
        System.out.print(sentence.toLowerCase());
        
        scanner.nextLine();
        System.out.print(sentence.substring(0,2));
        
        scanner.nextLine();
        System.out.print(sentence.substring(2));
        
        scanner.nextLine();
        System.out.print((double)(str.length()) / sentence.length());
        
        scanner.nextLine();
        System.out.print(sentence.equals("sentence"));
        
        scanner.nextLine();
        System.out.print(sentence.equals("java"));
        
        scanner.nextLine();
        System.out.print(sentence.equalsIgnoreCase("java"));
    }
}
