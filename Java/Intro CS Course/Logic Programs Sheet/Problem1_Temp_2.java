import javax.swing.JOptionPane;
public class Problem1_Temp_2
{
    public static void main()
    {
        double f, c, a;
        String i = JOptionPane.showInputDialog( "Enter the temperature in Celsius." );
        c = Integer.parseInt( i );
        a = 1.8;
        f = c * a;
        f = f + 32;
        System.out.println( "The temperature in Fahrenheit is " + f );
    }
}