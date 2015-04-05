public class Pearson_Arrays_14
{
    public static void main()
    {
        int a[] = {1,6,2,1,4,1,2,1,8};
        int with[] = {1,2,1};
        boolean Match = PriceIsRight(a, with);
        System.out.println(Match);
    }
    public static boolean PriceIsRight(int a[],int b[])
    {
        for (int i = 0; i <  a.length; i++)
        {
            for (int j = 0; j < b.length; j++)
            {
                if (a[i + j] == b[j])
                {
                    if (j == b.length-1)
                    {
                        return true;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        return false;
    }
}