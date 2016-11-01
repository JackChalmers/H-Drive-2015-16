import java.util.*;
import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class Library here.
 * 
 * @author jack Chalmers 
 * @version 11-1-16
 */
public class Library
{
    private ArrayList<Book> libraryBooks;  
    Scanner inF = new Scanner(new File("bookList.txt"));
    public void importLibrary() throws IOException, FileNotFoundException
    {
        libraryBooks = new ArrayList<Book>();
        String author,title,callNum;
        int publishYr;
        boolean chkdOut;
        while (inF.hasNextLine())
        {
            author = inF.nextLine();
            title = inF.next();
            callNum = inF.next();
            publishYr = inF.nextInt();
            chkdOut = inF.nextBoolean();
            inF.nextLine();
            
            libraryBooks.add(new Book(title,author,callNum,publishYr,chkdOut));
        }
  
    }
    
    /*
    public Library()
    {
        
    }
    */
}
