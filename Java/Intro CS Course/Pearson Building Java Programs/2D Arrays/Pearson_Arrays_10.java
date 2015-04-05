public class Pearson_Arrays_10
{
    public static void main()
    {
        int a[] = {6, 2, 9, 11, 3};
        int Even = 0;
        double Percent = 0;
        for (int i = 0; i < a.length; i++ )
        {
            if (a[i] % 2 == 0)
            {
                Even++;
            }
        }
        Percent = ((double)Even/a.length)*100;
        System.out.println(Percent + "% is even");
    }
}