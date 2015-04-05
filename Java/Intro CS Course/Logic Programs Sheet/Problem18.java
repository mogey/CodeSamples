public class Problem18
{   
    public static void main()
    {
        int n1 = 10110;
        int n2 = n1;
        int d;
        int sum = 0 ;
        int p = 1;
        while (n2 > 0)
        {
            // to set d to the end digit
            d = n2 % 10;
            if (d == 1)
            {
                // To add p to sum ex. 0 = 0 + 1, 1 = 1 + 2, 3 = 3 + 4
                sum += p;
            }
            // to increase p by 2 each time
            p *= 2;
            // shrink the number to get next digit
            n2 = n2 / 10; 
            
        }
        System.out.print( sum );
    }
}