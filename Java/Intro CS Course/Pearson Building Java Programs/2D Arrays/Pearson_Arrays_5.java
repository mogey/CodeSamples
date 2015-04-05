public class Pearson_Arrays_5
{
    public static void main()
    {
        int a[] = {27,15,15,11,17};
        int count = 1;
        int maxC = 0, Val = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < a.length; j++)
            {
                if (a[j] == a[i])
                {
                    count++;
                }
            }
            if (count > maxC)
            {
                maxC = count;
                Val = a[i];
            }
            count = 1;
        }
        System.out.println ("The Mode is " + Val);
    }
}