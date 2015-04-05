public class Exercise7 {
    public static void main(){
        writeChars(1);
        System.out.println();
        writeChars(2);
        System.out.println();
        writeChars(3);
        System.out.println();
        writeChars(4);
        System.out.println();
        writeChars(5);
        System.out.println();
        writeChars(6);
        System.out.println();
        writeChars(7);
        System.out.println();
        writeChars(8);
        System.out.println();
    }

    public static void writeChars(int n)
    {
        if(n == 0)
            return;
        else 
        if(n == 1 || n == 2){
            System.out.print("*");
            writeChars(n-1);
        }
        else

        {
            System.out.print("<");
            writeChars(n-2);
            System.out.print(">");
        }
    }
}
