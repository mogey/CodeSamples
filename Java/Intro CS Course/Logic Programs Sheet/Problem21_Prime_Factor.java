import javax.swing.JOptionPane;
public class Problem21_Prime_Factor
{
    public static void main()
    {
        int num = 0;
        int counter = 0;
        int sent = 0;
        String input = JOptionPane.showInputDialog( "Enter a number." );
        num = Integer.parseInt( input );
        counter = 3;
        sent = 0;
        if ( num % 2 != 0 )
        {
            sent = 1;
            while ( counter <= Math.sqrt( num ) )
            {
                if ( num % counter != 0 )
                {
                    counter = counter + 1;
                }
                else
                {
                    sent = 0;
                    break;
                }
            }
        }
        else
        {
            if ( num == 2 )
            {
                sent = 1;
            }
            else
            {
                counter = 2;
            }
        }
        
        if ( sent == 1 )
        {
            System.out.println( "Prime" );
        }
        else
        {
            System.out.println( "Prime, first factor is " + counter );
        }
    }
}