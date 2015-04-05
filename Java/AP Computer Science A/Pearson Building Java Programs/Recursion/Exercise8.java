public class Exercise8 
{
    public static void main()
    {
        System.out.println(multiplyEvens(1));
        System.out.println(multiplyEvens(4));
    }

    public static int multiplyEvens(int n)
    {
        if(n <= 0){
            return 1;
        }
        else
        {
            return n * 2 * multiplyEvens(n-1);
        }
    }
}
