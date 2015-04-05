public class Pearson_Arrays_6
{
    public static void main()
    {
        int a[] = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        double SD = 0;
        double Mean = 0, sum = 0;
        for (int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        Mean = sum/a.length;
        for (int i = 0; i < a.length; i++)
        {
            sum += (a[i] - Mean) * (a[i] - Mean);
        }
        sum /= a.length - 1;
        SD = Math.sqrt(sum);
        System.out.println(SD);
    }
}