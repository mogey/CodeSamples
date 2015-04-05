import javax.swing.JOptionPane;
public class Problem12
{
    public static void main()
    {
        int n1, n2, c, l, h, k;
        String i1, i2;
        
        i1 = JOptionPane.showInputDialog( "Enter a number." );
        i2 = JOptionPane.showInputDialog( "Enter the number to check for." );
        n1 = 0;
        n2 = 1;
        c = 0;
        l = i1.length();
        h = 0;
        k = Integer.parseInt( i2 );
        
        while ( n2 <= l )
        {
            h = Integer.parseInt(i1.substring( n1, n2 ));
            if ( h == k )
            {
                c = c + 1;
            }
            n1 = n1 + 1;
            n2 = n2 + 1;
        }
        System.out.println( "The number appears " + c  + " times." );
    }
}