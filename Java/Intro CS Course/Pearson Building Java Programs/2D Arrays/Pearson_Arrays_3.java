public class Pearson_Arrays_3
{
    public static void main()
    {
        int a[] = {14,1,22,17,36,7,-43,5};
        int Min = 4;
        int Max = 17;
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] >= Min && a[i] <= Max)
            {
                count++;
            }
        }
        System.out.println("The # of numbers that fall between " + Min + " and " + Max + " is " + count);
    }
}