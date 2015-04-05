public class Exercise10
{
    public static void main()
    {
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("ok", 1));
        System.out.println(repeat("bye", 0));
    }

    public static String repeat(String s, int n)
    {
        if(n == 0)
            return "";
        else
        {
            return s + repeat(s,n-1);
        }
    }
}
