import javax.swing.JOptionPane;
public class Problem14_Even_Digits
{
    public static void main()
    {
        int n1, n2, c, l, h;
        String i;
        
        i = JOptionPane.showInputDialog( "Enter a number." );
        n1 = 0;
        n2 = 1;
        c = 0;
        l = i.length();
        h = 0;
        
        while ( n2 <= l )
        {
            h = Integer.parseInt(i.substring( n1, n2 ));
            if ( h % 2 == 0 )
            {
                c = c + 1;
            }
            n1 = n1 + 1;
            n2 = n2 + 1;
        }
        System.out.println( "The number of even digits is " + c );
    }
}