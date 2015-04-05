    /**
    * Two_D_Shape: 
    * Extends Shape and holds the number of 2D shapes.
    * 
    */
public abstract class Three_D_Shape extends Shape
{
    // Count of 2D Shapes
    private static int my3DShapeCount;
    
    Three_D_Shape(){
        my3DShapeCount++;
    }
    Three_D_Shape(int x, int y)
    {
        my3DShapeCount++;
    }
    public void finalize()
    {
        super.finalize();
        my3DShapeCount--;      
    }      
    
    // get methods
    public static int getMyShapeCount()  // This 'getMyShapeCount()' overrides Shape's  
                                                           // getMyShapeCount()
    {
        return my3DShapeCount;   
    }    
    public String getMyShapeStats()
    {
       return toString();
    }
    
    // toString
    public String toString()
    {
        return "Invalid Shape";
    }
    
    // abstract method
    public abstract String getVolume();// Use DecimalFormat in the calculation and 
                                  //    REM it returns a "String!"
}

