/**
 * Two_D_Shape: 
 * Extends Shape and holds the number of 2D shapes.
 * 
*/

public abstract class Two_D_Shape extends Shape
{
    // Count of 2D Shapes
   private static int my2DShapeCount;
   
    Two_D_Shape()
    {
        super();
        my2DShapeCount++;// Implicit call to 'Shape' default constructor right here. iow: Shape()
    }
    Two_D_Shape(int x, int y)
    {
        super(x,y);
        my2DShapeCount++;
    }
   public void finalize()
   {
       super.finalize();
       my2DShapeCount--;
   }      

    // get methods
    public static int getMyShapeCount()  // This 'getMyShapeCount()' overrides Shape's  
                                                               // getMyShapeCount()
    {
        return my2DShapeCount;   
    }    
     public String getMyShapeStats()
     {
           return toString();
     }
     
     // toString
     public String toString()
     {
         return getMyShapeStats();
     }
    
    // abstract method
    public abstract String getArea();
        
}

