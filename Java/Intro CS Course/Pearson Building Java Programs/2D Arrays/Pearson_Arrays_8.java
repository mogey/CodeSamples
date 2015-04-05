public class Pearson_Arrays_8
{
    public static void main()
    {
        int a[] = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        int b[] = BubbleSort(a);
        int H = a.length/2;
        int median = 0 , d = 0, c = 0;
        if (a.length/2 == 1)
        {
            median = b[H/2];
        }
        else
        {
            c = b[H/2] + (b[H/2-1]);
            median = c/2;
        }
          
        System.out.println(median);
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