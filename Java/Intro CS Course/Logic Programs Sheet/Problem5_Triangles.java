import javax.swing.JOptionPane;
public class Problem5_Triangles
{
    public static void main()
    {
        int s1, s2, s3;
        String i1, i2, i3;
        
        i1 = JOptionPane.showInputDialog( "Enter the length of side 1." );
        i2 = JOptionPane.showInputDialog( "Enter the length of side 2." );
        i3 = JOptionPane.showInputDialog( "Enter the length of side 3." );
        
        s1 = Integer.parseInt( i1 );
        s2 = Integer.parseInt( i2 );
        s3 = Integer.parseInt( i3 );
        
        if ( s1 == s2 && s2 == s3 && s3 == s2 )
        {
            System.out.println( "The triangle is equilateral." );
        }
        else
        {
            if ( s1 == s2 || s2 == s3 || s3 == s1 )
            {
                System.out.println( "The triangle is isosceles." );
            }
            else
            {
                System.out.println( "The triangle is scalene." );
            }
        }
    }
}