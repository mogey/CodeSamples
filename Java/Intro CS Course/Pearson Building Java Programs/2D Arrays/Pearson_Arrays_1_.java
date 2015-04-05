public class Pearson_Arrays_1_
{
    public static void main()
    {
        int a[] = {74,85,102,99,101,85,56};
        int k = 85;
        for (int i = a.length - 1; i >= 0; i--)
        {
            if (a[i] == k)
            {
                System.out.println("Position of last index value is " + i);
                break;
            }
        }
    }
}