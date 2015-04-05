public class Problem16
{
    public static void main ()
    {
        int n1 = 12321;
        int nCopy = n1;
        int n2 = 0;
        while (nCopy > 0)
        {
            // to make n2 put a 0 at the end so the number can be added without adding onto the int
            n2 = n2 * 10;
            // adds onto n2 the last digit
            n2 = n2 + (nCopy % 10);
            // shirnks the num so the code can get the next last digit
            nCopy = nCopy / 10;
        }
        if (n2 == n1)
        {
            System.out.print("Yes!");
        }
        else
        {
            System.out.print("No!");
        }
    }
}
        