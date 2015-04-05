public class Problem13_
{
    public static void main ()
    {
        int k = 3, 
        d = 0, 
        num = 122342536, 
        count1 = 0, 
        count2 = 0, 
        count3 = 0;
        while (num > 0)
        {
            d = num % 10;
            if (d == k)
                count1++;
            else if (d > k)
                count2++;
            else if (d < k)
                count3++;
            num/= 10;    
            
        }
        System.out.println ("There are " + count1++ + " amount of digits equal to k");
        System.out.println ("There are " + count2++ + " amount of digits greater than to k");
        System.out.println ("There are " + count3++ + " amount of digits less than to k");
    }
}
        