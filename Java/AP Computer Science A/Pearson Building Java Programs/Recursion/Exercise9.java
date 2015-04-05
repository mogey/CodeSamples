public class Exercise9
{
    public static void main()
    {
        System.out.println(sumTo(2));
    }

    public static double sumTo(double n)
    {
        if(n<=0)
            return 0;
        else
        {
            return 1.0/n + sumTo(n - 1.0);
        }
    }
}

