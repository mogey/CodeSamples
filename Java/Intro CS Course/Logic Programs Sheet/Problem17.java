public class Problem17
{
    public static void main ()
    {
        int n1 = 123456;
        int nCopy = n1;
        int n2 = 0;
        while (nCopy > 0)
        {
            n2 = n2 * 10;
            n2 = n2 + (nCopy % 10);
            nCopy = nCopy / 10;
        }
        System.out.print(n2);
    }
}
        