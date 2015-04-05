import javax.swing.JOptionPane;
public class Problem10_Remainders
{
    public static void main()
    {
        int n1, n2, a, r;
        String i1, i2;
        
        i1 = JOptionPane.showInputDialog( "Input a number." );
        i2 = JOptionPane.showInputDialog( "Input a number." );
        n1 = Integer.parseInt( i1 );
        n2 = Integer.parseInt( i2 );
        a = 0;
        r = 0;
        
        if ( n1 > n2 )
        {
            a = n1 / n2;
            r = n1 % n2;
        }
        else
        {
            a = n2 / n1;
            r = n2 % n1;
        }
        
        System.out.println( a + " R " + r );
    }
}