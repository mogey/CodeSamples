
public class Exercise5 {
    public static void main() {
        writeBinary(44);
    }

    public static void writeBinary(int n)
    {
        if(n == 0) 
            return;
        else
        {
            writeBinary(n / 2);
            System.out.print(n%2);
        }

    }
}
