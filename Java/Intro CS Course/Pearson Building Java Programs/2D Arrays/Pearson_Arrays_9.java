public class Pearson_Arrays_9
{
    public static void main()
    {
        int a[] = {1, 3, 6, 7, 12};
        int minD = a[1] - a[0];
        int potM = 0;
        if (a.length < 2)
        {
            System.out.println("0");
        }
        else
        {
            for (int i = 1; i < a.length - 1; i++)
            {
                potM = a[i+1] - a[i];
                if (potM < minD)
                {
                    minD = potM;
                }
            }
            System.out.println("The min difference is " + minD);
        }
    }
}