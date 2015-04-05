public class Pearson_Arrays_2
{
    public static void main()
    {
        int a[] = {36,12,25,19,46,31,22};
        int S = a[0];
        int L = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < S)
            {
                S = a[i];
            }
            else if(a[i] > L)
            {
                L = a[i];
            }
        }
        System.out.println("Range is " + (L - S + 1));
    }
}