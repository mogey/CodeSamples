import javax.swing.JOptionPane;
public class Problem3_Gravity
{
    public static void main()
    {
        int p, a;
        double w;
        String iP, iA;
        
        iA = JOptionPane.showInputDialog( "Enter your weight." );
        iP = JOptionPane.showInputDialog( "Select a planet(1-9)." );
        a = Integer.parseInt( iA );
        p = Integer.parseInt( iP );
        w = (double) a;
        switch ( p )
        {
            case 1:  w = w * .38;
                     break;
            case 2:  w = w * .78;
                     break;
            case 3:  w = w;
                     break;
            case 4:  w = w * .39;
                     break;
            case 5:  w = w * 2.65;
                     break;
            case 6:  w = w * 1.17;
                     break;
            case 7:  w = w * 1.05;
                     break;
            case 8:  w = w * 1.23;
                     break;
            case 9:  w = w * 0.05;
                     break;
        }
        System.out.println( w );
    }
}