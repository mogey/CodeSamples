import javax.swing.JOptionPane; 
public class Problem_22
{ 
    public static void main() { 
        int n = Integer.parseInt(JOptionPane.showInputDialog( "Enter the number:")); 
        int count=0,j,i=0;
        while (count<n) { count++; i=0;
           for (j=2;j<=(count/2);j++)
            { i=0; 
              if (0==count%j) 
                { i=i+1; 
                } 
            }
           if (0==i) 
            { 
                System.out.print(count+" "); 
            } 
        } 
    }
}
