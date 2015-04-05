public class Pearson_Arrays_13
{
    public static void main()
    {
        int Nums[] = {3,8,10,1,9,14,-3,0,14,207,208,209,210,211,56,98,12};
        int C = LongSortSeq(Nums);
        System.out.println(C);
    }
    public static int LongSortSeq(int a[])
    {
        int count = 1;
        int GreatestC = 0;
        for (int i = 0; i <  a.length-1; i++)
        {
            if (a[i + 1] > a[i])
            {
                count++;
                if (count > GreatestC)
                {
                    GreatestC = count;
                }
            }
            else
            {
                count = 0;
            }
        }
        return GreatestC+1;
    }
}