public class ForLoopEx
{
    public static void main()
    {
        //1. What type of error occurrs within these three lines of code and why?  
        //   How could this error have been avoided?
        int[] a = {1,2,3,4,5,6};
        //int[] b;
        int[] b = new int[1];
        b[0] = 4 ;          
        
        
        //2. Draw a diagram showing what c and d refer to and determine what 
        //   occurs after each line of code in this section.
        int[] c = {0,2,4,6,8};
        int[] d = {7};
        d = c;                  // a) What does this do?
        d[3] = -10;             // b) Is this allowed?
        System.out.print(c[3]); // c) What will this display and WHY?
        
        
        
        
        /*3.  Google the clone() method for arrays. Describe in your own words how it works.  
         *    Then do the following:
         *      Create an array called temps with the values 67, 78, 88, 58, 90, and 34.  
         *      Clone this array and name it tempsClone.
         *      Change the first two values in the cloned copy and print both the original 
         *      and the clone to show they are in fact different arrays. 
         */
            int[] temps = {67,78,88,58,90,34};
            int[] tempsClone = temps.clone();
            tempsClone[0] = 1;
            tempsClone[1] = 3;
            
            for(int j = 0; j < temps.length; j++)
                System.out.print(temps[j]);
                
            for(int j = 0; j < tempsClone.length; j++)
                System.out.print(tempsClone[j]);
        
        
        
        
        
        
        
        
        /*4.  Google the arraycopy() method for arrays.   Describe in your own words how it works.  
         *    Create a new array called tempsDouble that is twice the size as the temps array you created in #3.  
         *    Copy over all the values from temps except the first and last array value.  Print out the new array.
         */
       
        
       
       
       
        
            
        //In this next section you will see examples of a regular for loop and a
        //foreach loop.  Analyze the code and then answer the questions 5 and 6.

        int[] squares = new int[10];
        
        System.out.println("\n\nRegular for loop...\n");        
        for (int i = 0; i < squares.length; i++){
            squares[i] = i*i;
            System.out.println("Squares[" + i + "] is " + squares[i]);
        }
        
        System.out.println("\nForeach loop...\n");
        int index = 0; 
        for (int entry: squares){
            System.out.println("Squares[" + index + "] is " + entry); 
            index++;
        }
        
        /* 5. what is the difference between the regular for loop and the foreach loop?
         * 
         * 
         * 6. Describe the way to write the foreach loop in your own words.  Google it if you 
         *    are unsure of how/why it works.  
         *    
         */
        
        
        
        /*7.
         * Write a for loop the traditional way to generate the sum of the entries in the squares 
         * array, find the average and then print the average.  Then write the code to do the same thing 
         * using a foreach loop.  Be sure to typecast your average so that it is a decimal!
         */ 

        // Traditional For loop
            

       
        
        
        // Foreach loop
       
    }
    
}
    
   