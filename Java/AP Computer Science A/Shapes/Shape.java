public abstract class Shape {
    private Point myPoint = new Point();  // Holds coordinates of shape in a Point
    private static int myShapeCount; // Count of total Shapes
 
    // constructor
    public Shape()
    {
        myPoint = new Point(0,0);
        myShapeCount++;
    }

    public Shape( int x, int y )
    {
        myPoint = new Point(x,y);
        myShapeCount++;
    }
    public void finalize()
    {
        myShapeCount--;   
    }
    public String toString()
    {
        return "";
    }

    // get methods
    public final Point getMyPoint()  // NOTE: a 'final' method!!!  :)
    {
        return myPoint;    
    }
    public static int getMyShapeCount() // rem: this is implicitly 'final'
    {                                    // getMyShapeCount() is 'overriden' in both 2D_Shape & 3D_Shape       

        return myShapeCount;  
    }

    // abstract method
    

}  // end class Shape


