import javax.swing.JOptionPane;
public class Problem9_Grades
{
    public static void main()
    {
        int g1, g2, g3, g4, g5, s;
        String i1, i2, i3, i4, i5;
        double a;
        
        i1 = JOptionPane.showInputDialog( "Enter grade 1." );
        g1 = Integer.parseInt( i1 );
        s = g1;
        i2 = JOptionPane.showInputDialog( "Enter grade 2." );
        g2 = Integer.parseInt( i2 );
        if ( g2 < s )
        {
            s = g2;
        }
        i3 = JOptionPane.showInputDialog( "Enter grade 3." );
        g3 = Integer.parseInt( i3 );
        if ( g3 < s )
        {
            s = g3;
        }
        i4 = JOptionPane.showInputDialog( "Enter grade 4." );
        g4 = Integer.parseInt( i4 );
        if ( g4 < s )
        {
            s = g4;
        }
        i5 = JOptionPane.showInputDialog( "Enter grade 5." );
        g5 = Integer.parseInt( i5 );
        if ( g5 < s )
        {
            s = g5;
        }
        
        a = ( ( g1 + g2 + g3 + g4 + g5 ) - s ) / 4;
        
        System.out.println( "The average is " + a );
    }
}