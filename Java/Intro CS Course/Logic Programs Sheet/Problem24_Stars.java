import javax.swing.JOptionPane;
public class Problem24_Stars
{
    public static void main()
    {
        int c1, c2, c3, r, s, a;
        String i1, i2;
        
        i1 = JOptionPane.showInputDialog( "Enter the number of rows to print." );
        i2 = JOptionPane.showInputDialog( "Enter the number of stars per row." );
        c1 = 0;
        c2 = 0;
        c3 = 0;
        r = Integer.parseInt( i1 );
        a = Integer.parseInt( i2 );
        s = 0;
        
        while ( c1 < r )
        {
            while ( c2 < s )
            {
                System.out.print( " " );
                c2 = c2 + 1;
            }
            while ( c3 < a )
            {
                System.out.print( "*" );
                c3 = c3 + 1;
            }
            s = s + 1;
            c1 = c1 + 1;
            c2 = 0;
            c3 = 0;
            System.out.println( "" );
        }
    }
}