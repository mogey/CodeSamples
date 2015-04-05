import java.util.Arrays;
public class Pearson_Arrays_15
{
    public static void main()
    {
        int a[] = {1,2,3,4,5};
        int C[] = PriceIsRight(a);
        System.out.println(Arrays.toString(C));
    }
    public static int[] PriceIsRight(int a[])
    {
        int k = 0;
        int b[];
        if (a.length % 2 == 1)
        {
            b = new int [a.length/2 + 1];
            b[b.length-1] = a[a.length - 1];
            for (int i = 0; i < a.length-1; i+=2)
            {
                b[k] = a[i] + a[i+1];
                k++;
            }
        }
        else
        {
            b = new int [a.length/2];
            for (int i = 0; i < a.length; i+=2)
            {
                b[k] = a[i] + a[i+1];
                k++;
            }
        }
        return b;
    }
}