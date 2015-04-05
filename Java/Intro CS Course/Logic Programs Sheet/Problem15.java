public class Problem15
{
    public static void main ()
    {
        int k = 3, d = 0, num = 22466, True = 0, False = 0;
        while (num > 0)
        {
            d = num % 10;
            if (num % 2 == 0)
                True++;  
            else 
                False++;
            num/= 10;                         
        }
        if (False > 0)
            System.out.print ("False");
        else    
            System.out.print ("True");
       }
}
        