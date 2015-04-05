public class Exercise6
{
    public static void main()
    {
        writeSquares(8);
    }

    public static void writeSquares(int n)
    {
        if(n>1)
        {
            if(n%2==1){
                System.out.print(n*n + ", ");
            }
            writeSquares(n-1);
        }
        if(n%2==0){
            System.out.print(n*n + ", ");
        }
        else if(n==1){
            System.out.print(n*n + ", ");
        }
    }
}
