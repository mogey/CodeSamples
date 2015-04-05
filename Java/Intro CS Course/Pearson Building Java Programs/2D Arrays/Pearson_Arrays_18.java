import java.util.Arrays;
public class Pearson_Arrays_18
{
    public static void main()
    {
        String a[] = {"hello", "how", "are", "you", "feeling", "today"};
        int N[] = numC(a);
        System.out.println(Arrays.toString(N));
    }
    public static int[] numC(String a[])
    {
        int F[] = new int [10];
        String sele = "";
        for (int i = 0;i < a.length; i++)
        {
            sele = a[i];
            if (sele.length()==1)
            {
                F[0]++;
            }
            else if (sele.length()==2)
            {
                F[1]++;
            }
            else if (sele.length()==3)
            {
                F[2]++;
            }
            else if (sele.length()==4)
            {
                F[3]++;
            }
            else if (sele.length()==5)
            {
                F[4]++;
            }
            else if (sele.length()==6)
            {
                F[5]++;
            }
            else if (sele.length()==7)
            {
                F[6]++;
            }
            else if (sele.length()==8)
            {
                F[7]++;
            }
            else if (sele.length()==9)
            {
                F[8]++;
            }
            else if (sele.length()==10)
            {
                F[9]++;
            }
        }
        return F;
    }
}