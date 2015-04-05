import javax.swing.JOptionPane;
public class Problem8_Largest_Smallest
{
    public static void main()
    {
        int hold, nS, nL, counter;
        String input;
        
        counter = 1;
        input = JOptionPane.showInputDialog( "Enter a number." );
        hold = Integer.parseInt( input );
        nS = hold;
        nL = hold;
        
        while ( counter < 5 )
        {
            input = JOptionPane.showInputDialog( "Enter a number." );
            hold = Integer.parseInt( input );
            
            if ( hold < nS )
            {
                nS = hold;
            }
            if ( hold > nL )
            {
                nL = hold;
            }
            counter = counter + 1;
        }
        
        System.out.println( "The largest number is " + nL );
        System.out.println( "The smallest number is " + nS );
    }
}