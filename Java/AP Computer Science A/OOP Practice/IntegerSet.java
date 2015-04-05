/** Mr. Marques   10/19/06
 * IntegerSet_Chap8_17_CLIENT
 * Deitel 4th Edition
 * Chap 8 #17 pg443
 * 
 * IntegerSet objects contain a boolean array (length 10, thus the numbers are 0-9) 
 * where a[i] is true if that element is in the set. This client performs simple set 
 * operations on the objects.
 *  
*/

import javax.swing.*;

// REM: Take out the _SHELL part!!!
public class IntegerSet // Get rid of the _SHELL first!!
{
private boolean nums[] = new boolean[10];  // YES, declare and define a var up here is legal!
                                        // Declaration: boolean nums[]: "nums is an array of booleans!"
                                        // Defined: "And it's size is 10 booleans long."

    // --------------------------- Constructors -----------------------------------------
    public IntegerSet()
    {
        // empty
    }
    public IntegerSet(int k0)         
    {
       nums[k0]=true; 
    }  
    public IntegerSet(int k0, int k1)              
    {
       nums[k0]=true; nums[k1]=true;
    }  
    public IntegerSet(int k0, int k1, int k2) 
    {
       nums[k0]=true; nums[k1]=true; nums[k2]=true; 
    }  
    public IntegerSet(int k0, int k1, int k2, int k3) 
    {
       nums[k0]=true; nums[k1]=true; nums[k2]=true; nums[k3]=true; 
    }  
    public IntegerSet(int k0, int k1, int k2, int k3, int k4) 
    {
       nums[k0]=true; nums[k1]=true; nums[k2]=true; nums[k3]=true; nums[k4]=true; 
    }  
    public IntegerSet(int k0, int k1, int k2, int k3, int k4, int k5) 
    {
       nums[k0]=true; nums[k1]=true; nums[k2]=true; nums[k3]=true; nums[k4]=true; nums[k5]=true; 
    }  
    public IntegerSet(int k0, int k1, int k2, int k3, int k4, int k5, int k6) 
    {
       nums[k0]=true; nums[k1]=true; nums[k2]=true; nums[k3]=true; nums[k4]=true; nums[k5]=true; nums[k6]=true; 
    }  
    public IntegerSet(int k0, int k1, int k2, int k3, int k4, int k5, int k6, int k7) 
    {
       nums[k0]=true; nums[k1]=true; nums[k2]=true; nums[k3]=true; nums[k4]=true; nums[k5]=true; nums[k6]=true; nums[k7]=true;
    }  
    public IntegerSet(int k0, int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8) 
    {
       nums[k0]=true; nums[k1]=true; nums[k2]=true; nums[k3]=true; nums[k4]=true; nums[k5]=true; nums[k6]=true; nums[k7]=true; nums[k8]=true; 
    }  
    public IntegerSet(int k0, int k1, int k2, int k3, int k4, int k5, int k6, int k7, int k8, int k9)              
    {
       nums[k0]=true; nums[k1]=true; nums[k2]=true; nums[k3]=true; nums[k4]=true; nums[k5]=true; nums[k6]=true; nums[k7]=true; nums[k8]=true; nums[k9]=true;
    } 
    
    
    // ---------------------------------------------------------------------    
    public void inputIntegerSet()
    {
    int k;

      k = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number (0-9). -1 ends the input"));       
      while (k!=-1) {
          if (k<0 || k>9)
            JOptionPane.showMessageDialog(null, "\t ERROR!!\n  Enter numbers 0-9 ONLY!!","ERROR",JOptionPane.ERROR_MESSAGE);
          else
            nums[k]=true;          
          k = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number (0-9). -1 ends the input"));        
      } 
    }

    // YOU write the following methods given these stubs:
    //      public IntegerSet unionOfIntegerSets(IntegerSet right)
    //      public IntegerSet intersectionOfIntegerSets(IntegerSet right)
    //      public bookean isEqualTo(IntegerSet right)
    //      public void insertElement(int i)
    //      public void deleteElement(int i)

    public IntegerSet unionOfIntegerSets(IntegerSet right)  
    {
            IntegerSet newSet = new IntegerSet();
           for(int i = 0; i < this.nums.length; i++){
               if (this.nums[i] == true || right.nums[i] == true){
                   newSet.nums[i] = true;
               }
               else{
                   newSet.nums[i] = false;
               }
            }
            return newSet;
    }
    public IntegerSet intersectionOfIntegerSets(IntegerSet right) 
    {
            IntegerSet newSet = new IntegerSet();
           for(int i = 0; i < this.nums.length; i++){
               if (this.nums[i] == true && right.nums[i] == true){
                   newSet.nums[i] = true;
               }
               else{
                   newSet.nums[i] = false;
               }
            }
            return newSet;
    }
    public boolean isEqualTo(IntegerSet right)
    {
           for(int i = 0; i < this.nums.length; i++){
               if (this.nums[i] == true && right.nums[i] == true){
                   return true;
               }
               else{
                   return false;
               }
            }
            return false;
    }    
    public void insertElement(int i)
    {
           this.nums[i] = true;
    }    
    public void deleteElement(int i)
    {
           this.nums[i] = false;
    }    
      // Note how we invoke another method, thus reusing code!  COOL!!!
    public String printIntegerSet()
    {
        return toString();
    }
    
    // ---------------------------------------------------------------------    
    public String toString()
    {
    String s="{";
    int falseCount=0;
    
        for (int i=0; i<10; i++)
          if (nums[i]==true)
            s += i + ", ";              
          else 
            falseCount++;
          s += "}";
          
        if (falseCount==nums.length)
            return "{---}";
            
        return s;        
    }    

    // Note how we invoke another method, thus reusing code!  COOL!!!
    public boolean isNotEqualTo(IntegerSet right)
    {
        return !isEqualTo(right);   
    }
}
