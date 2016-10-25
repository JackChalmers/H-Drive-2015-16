

public class MatrixDay2
{
    public static void main()
    {
        int [][] diceroll = {   {1, 3, 5, 2, 3, 6},
                                {2, 4, 6, 1, 1, 5},
                                {3, 2, 5, 6, 4, 3},
                                {4, 1, 1, 2, 3, 2}  };
                                
        for(int[] row: diceroll) {
            for(int num: row)
                System.out.print(num + " ");
            
            System.out.println("");
        }
        
        int sum = 0;
        for(int[] row: diceroll)
        {
            for(int nums: row)
            sum += nums;
            
            
            System.out.print((double)sum/row.length + "  ");
            sum = 0;
        }
        
        
        int winnings = 0;
        int winner[] = new int[diceroll.length];
        for(int i = 0; i < diceroll.length; i++)
        {
            winnings = 0;
            for(int j = 0; j < diceroll[i].length; j++)
            {
                if(diceroll[i][j] == 1 || diceroll[i][j] == 2)
                    winnings += 5;
                    else
                        winnings -=3;
                
                        
                
            }
            
            System.out.println("");
            
            for(int k = 0; k < winner.length; k++)
            {
                winner[k] = winnings;
                
            }
            
            System.out.print(winnings + " ");
            
        }
        
    }
}
