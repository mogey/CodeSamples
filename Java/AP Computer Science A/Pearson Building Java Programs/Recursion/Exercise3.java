
public class Exercise3
{
    public static void main()
    {
        writeSequence(1);
        System.out.println();
        writeSequence(2);
        System.out.println();
        writeSequence(3);
        System.out.println();
        writeSequence(4);
        System.out.println();
        writeSequence(5);
        System.out.println();
        writeSequence(6);
        System.out.println();
        writeSequence(7);
        System.out.println();
        writeSequence(8);
        System.out.println();
        writeSequence(9);
        System.out.println();
        writeSequence(10);
        System.out.println();
    }

    public static void writeSequence(int n)
    {
        if(n == 0)
            return;
        else 
        if(n == 1 || n == 2){
            System.out.print("1 ");
            writeSequence(n-1);
        }
        else
        if(n % 2 == 0)
        {
            System.out.print(n/2 + " ");
            writeSequence(n-2);
            System.out.print(n/2 + " ");
        }
        else
        {
            System.out.print(n/2 + 1 + " ");
            writeSequence(n-2);
            System.out.print(n/2 + 1 + " ");
        }
    }
}
