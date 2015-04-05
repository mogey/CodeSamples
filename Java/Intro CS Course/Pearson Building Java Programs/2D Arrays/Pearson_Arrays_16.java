import java.util.Arrays;
public class Pearson_Arrays_16
{
    public static void main()
    {
        int a[] = {1,2,3,4,5};
        int b[] = {5,4,3,2,1};
        int N[] = new int [a.length + b.length];
        for (int i = 0; i < a.length; i++)
        {
            N[i] = a[i];
        }
        for (int i = 0; i < b.length; i++)
        {
            N[i + a.length] = b[i];
        }
        System.out.println(Arrays.toString(N));
    }
}