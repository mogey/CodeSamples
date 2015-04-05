import javax.swing.JOptionPane;
public class Problem11_Scientific
{
    public static void main()
    {
        double n;
        int c;
        String i;
        
        i = JOptionPane.showInputDialog( "Enter a number." );
        n = Integer.parseInt( i );
        c = 0;
        
        while ( n >= 10 )
        {
            n = n / 10;
            c = c + 1;
        }
        System.out.println( n + " * 10^" + c );
    }
}