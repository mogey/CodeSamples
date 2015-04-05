import javax.swing.JOptionPane;
public class Problem25_Rows
{
    public static void main()
    {
        int c1, c2, c3, r, s, h;
        String i;
        
        i = JOptionPane.showInputDialog( "Enter the number of rows to print." );
        c1 = 0;
        c2 = 0;
        c3 = 0;
        r = Integer.parseInt( i );
        s = ( r * 2 ) - 1;
        h = 1;
       
        while ( c1 < r )
        {
            while ( c2 < h )
            {
                c2 = c2 + 1;
                System.out.print( c2 );
            }
            while ( c3 < s )
            {
                System.out.print( " " );
                c3 = c3 + 1;
            }
            while ( c2 > 0 )
            {
                System.out.print( c2 );
                c2 = c2 - 1;
            }
            s = s - 2;
            c1 = c1 + 1;
            c2 = 0;
            c3 = 0;
            h = h + 1;
            System.out.println( "" );
        }
    }
}