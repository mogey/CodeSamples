
public class Exercise2
{
    public static void main()
    {
        writeNums(5);
        System.out.println();
        writeNums(12);
        System.out.println();
    }

    public static void writeNums(int n)
    {
        if(n>0) {
            writeNums(n-1);
            System.out.print(n + ",");
        }

    }
}
