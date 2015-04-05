public class Problem12_
{
    public static void main ()
    {
        int num = 1323343;
        int k = 3, d;
        int increase = 1;
        while ( num > 1 )
        {
            d = num /= 10;
            if ( k == d )
            {
                increase++;
                num /= num;
            }
            else 
            {
                num /= num;
            }
            System.out.print(d);  
            }
        }
    }
        