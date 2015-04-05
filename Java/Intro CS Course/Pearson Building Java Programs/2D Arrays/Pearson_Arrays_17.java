import java.util.Arrays;
public class Pearson_Arrays_17
{
    public static void main()
    {
        String a = "i think therefore i am";
        int N[] = vowelC(a);
        System.out.println(Arrays.toString(N));
    }
    public static int[] vowelC(String a)
    {
        int F[] = new int [5];
        String sele = "";
        for (int i = 0;i < a.length(); i++)
        {
            sele = a.charAt(i)+"";
            if (sele.equals("a") == true)
            {
                F[0]++;
            }
            else if (sele.equals("e") == true)
            {
                F[1]++;
            }
            else if (sele.equals("i") == true)
            {
                F[2]++;
            }
            else if (sele.equals("o") == true)
            {
                F[3]++;
            }
            else if (sele.equals("u") == true)
            {
                F[4]++;
            }
        }
        return F;
    }
}