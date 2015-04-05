
public class Exercise1 {
    public static void main() {
        starString(0);
        starString(1);
        starString(2);
        starString(3);
        starString(4);
    }

    public static void starString(int n) {       
        if(n==0){
            System.out.println("*");
        }
        else {
            for(int i=1;i<=(Math.pow(2,n)-Math.pow(2,n-1));i++)
                System.out.print("*");
            starString(n-1);
        }
    }
}
