// only works for the number provided :( doesn't work for any input
public class Problem11
{
    public static void main()
    {
        int in = 987654, divide, remainder, count = 0;
        divide = in / 100000; //first digit
        remainder = in % 100000;
        System.out.print(divide + "." + remainder + " x 10^" + count);
    }
}