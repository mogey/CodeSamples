
public class Exercise4
{
    public static void main()
    {
        System.out.println(doubleDigits(348));
        System.out.println(doubleDigits(-789));
    }

    public static int doubleDigits(int n)
    {
        if(n!=0)
        {
            String a=""+(Math.abs(n));
            int b=(int)Math.pow(10,a.length()-1);
            int c=n/b;
            if(b!=1)
                return doubleDigits(n%b)+(c*(int)Math.pow(10,a.length()*2-1)+c*(int)Math.pow(10,a.length()*2-2));
            else
                return c*(int)Math.pow(10,1)+c;
        }
        else
            return 0;
    }
}

