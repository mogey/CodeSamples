public class Pearson_Arrays_7
{
    public static void main()
    {
        int a[] = {74, 85, 102, 99, 101, 56, 84};
        int k = 2;
        int b[] = BubbleSort(a);
        System.out.print(b[k]);
    }
    public static int[] BubbleSort(int num[])
    {
        int temp;   
        for (int i=1; i<num.length; i++)
        {
            for(int j=0; j<num.length-i; j++)
            {
                if (num[j] < num [j+1])
                {
                    temp = num [j];
                    num [j] = num [j+1];
                    num [j+1] = temp;
                }
            }
        }

        return num;
    }
}