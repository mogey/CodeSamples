import javax.swing.JOptionPane;
public class Problem1_Temp
{
    public static void main()
    {
        double f, c, a;
        String i = JOptionPane.showInputDialog( "Enter the temperature in Fahrenheit." );
        f = Integer.parseInt( i );
        a = 0.555555556;
        f = f - 32;
        c = f * a;
        System.out.println( "The temperature in Celsius is " + c );
    }
}