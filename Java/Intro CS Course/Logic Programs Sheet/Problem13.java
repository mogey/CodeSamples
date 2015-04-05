import javax.swing.JOptionPane;
public class Problem13
{
    public static void main()
    {
        int n1, n2, c1, c2, c3, l, h, k;
        String i1, i2;
        
        i1 = JOptionPane.showInputDialog( "Enter a number." );
        i2 = JOptionPane.showInputDialog( "Enter the number to check for." );
        n1 = 0;
        n2 = 1;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        l = i1.length();
        h = 0;
        k = Integer.parseInt( i2 );
        
        while ( n2 <= l )
        {
            h = Integer.parseInt(i1.substring( n1, n2 ));
            if ( h == k )
            {
                c1 = c1 + 1;
            }
            else
            {
                if ( h > k )
                {
                    c2 = c2 + 1;
                }
                else
                {
                    c3 = c3 + 1;
                }
            }
            n1 = n1 + 1;
            n2 = n2 + 1;
        }
        System.out.println( "The number appears " + c1  + " times." );
        System.out.println( "There are " + c2 + " numbers greater than the input." );
        System.out.println( "There are " + c3 + " numbers less than the input." );
    }
}