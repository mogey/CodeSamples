import javax.swing.JOptionPane;
public class Problem4_PhoneCall
{
    public static void main()
    {
        int time;
        double cost, add;
        
        String input = JOptionPane.showInputDialog( "Enter length of phone call." );
        cost = 0;
        time = Integer.parseInt( input );
        
        if ( time > 3 )
        {
            cost = 3.75;
            time = time - 3;
            if ( time > 3 )
            {
                cost = 8.25;
                time = time - 3;
                if ( time > 3 )
                {
                    time = time - 3;
                    cost = 13.5 + ( time * 2 );
                }
                else
                {
                    cost = cost + ( 1.75 * time );
                }
            }
            else
            {
                cost = cost + ( time * 1.5 );
            }
        }
        else
        {
            cost = cost + ( time * 1.25 );
        }
        System.out.println( "The cost of the call is " + cost );
    }
}