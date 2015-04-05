import javax.swing.JOptionPane;
public class Problem7_Slope
{
    public static void main()
    {
        int x1, y1, x2, y2, xd, yd;
        double slope;
        String ix1, iy1, ix2, iy2;
        
        ix1 = JOptionPane.showInputDialog( "Input the first X coordinate." );
        iy1 = JOptionPane.showInputDialog( "Input the first Y coordinate." );
        ix2 = JOptionPane.showInputDialog( "Input the second X coordinate." );
        iy2 = JOptionPane.showInputDialog( "Input the second Y coordinate." );
        x1 = Integer.parseInt( ix1 );
        y1 = Integer.parseInt( iy1 );
        x2 = Integer.parseInt( ix2 );
        y2 = Integer.parseInt( iy2 );
        
        if ( x1 > x2 )
        {
            xd = x1 - x2;
        }
        else
        {
            xd = x2 - x1;
        }
        
        if ( y1 > y2 )
        {
            yd = y1 - y2;
        }
        else
        {
            yd = y2 - y1;
        }
        
        slope = yd / xd;
        System.out.println( "The slope is " + slope );
    }
}