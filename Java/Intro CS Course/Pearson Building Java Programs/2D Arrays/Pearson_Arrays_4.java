public class Pearson_Arrays_4
{
    public static void main()
    {
        double a[] = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};
        double Next = a[0];
        int q = 0;
        for (int i = 1; i < a.length - 1; i++)
        {
            if (a[i] > a[i+1])
            {
                q++;
                break;
            }
        }
        if(q == 1)
        {
            System.out.println("False");
        }
        else
        {
            System.out.println("True");
        }
    }
}