import javax.swing.JOptionPane;
public class Problem15_EvenDigits
{
    public static void main()
    {
        int n1, n2, c, l, h, f;
        String i;
        
        i = JOptionPane.showInputDialog( "Enter a number." );
        n1 = 0;
        n2 = 1;
        f = 0;
        l = i.length();
        h = 0;
        
        while ( n2 <= l )
        {
            h = Integer.parseInt(i.substring( n1, n2 ));
            if ( h % 2 == 0 )
            {
                n1 = n1 + 1;
                n2 = n2 + 1;
            }
            else
            {
                f = 1;
                break;
            }
        }
        if ( f == 0 )
        {
            System.out.println( "All of the digits are even." );
        }
        else
        {
            System.out.println( "Not all of the digits are even." );
        }
    }
}