import javax.swing.JOptionPane;
public class Problem18_Binary
{
    public static void main()
    {
        int l, c;
        String i;
        
        i = JOptionPane.showInputDialog( "Enter a binary code 1-8 digits long." );
        l = i.length();
        c = Integer.parseInt( i, 2 );
        System.out.println( c );
    }
}