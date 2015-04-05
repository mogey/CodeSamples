import javax.swing.JOptionPane;
public class Problem2_QuadraticRools
{
    public static void main()
    {
        int a, b, c, d;
        String iA, iB, iC;
        
        a = Integer.parseInt(JOptionPane.showInputDialog( "Enter the A term." ));
        b = Integer.parseInt(JOptionPane.showInputDialog( "Enter the B term." ));
        c = Integer.parseInt(JOptionPane.showInputDialog( "Enter the C term." ));
        d = ( b * b ) - ( 4 * a * c );
        
        if ( d == 0)
        {
            System.out.println( "There is 1 real root." );
        }
        else
        {
            if ( d > 0 )
            {
                System.out.println( "There are 2 real roots." );
            }
            else
            {
                System.out.println( "There are no real roots." );
            }
        }
    }
}