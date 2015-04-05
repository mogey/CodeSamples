public class Problem14
{
    public static void main ()
    {
        int k = 3, 
        d = 0, 
        num = 2234566, 
        count1 = 0;
        while (num > 0)
        {
            d = num % 10;
            if (num % 2 == 0)
                count1++;  
            num/= 10;              
        }
        System.out.print (count1);
    }
}
        