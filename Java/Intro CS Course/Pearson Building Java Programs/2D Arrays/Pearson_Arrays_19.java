import java.util.Arrays;
public class Pearson_Arrays_19
{
    public static void main()
    {
        int a[][] = {   {1,2},{3,4},{5,5},{4,3},{2,1} };
                        
        int b[][] = {   {5,4},{3,2},{1,1},{2,3},{4,5} };
        
        int N[][] = new int [a.length][a[0].length];
        for (int i = 0 ; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                N[i][j] = a[i][j] + b[i][j];
            }
        }
        
        System.out.println(Arrays.deepToString(N));
    }
}