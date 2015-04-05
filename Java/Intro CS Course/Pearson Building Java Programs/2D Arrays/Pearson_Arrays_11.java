public class Pearson_Arrays_11
{
    public static void main()
    {
        int a[] = {3, 8, 12, 2, 9, 17, 43, -8, 46};
        int b[] = {4, 7, 3, 9, 12, -47, 3, 74};
        boolean T = isUnique(a);
        System.out.println(T);
        T = isUnique(b);
        System.out.println(T);
    }
    public static boolean isUnique(int N[])
    {
        for (int i = N.length; i > 0; i--)
        {
            for (int j = 1; j < i; j++)
            {
                if (N[j-1] == N[i-1])
                {
                    return false;
                }
            }
        }
        return true;
    }
}