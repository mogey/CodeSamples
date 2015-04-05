import java.text.DecimalFormat;

// Definition of class Square.
public final class Triangle extends Two_D_Shape
{

    private final String MY_SHAPE = "Triangle";  //You can initialize here
    //OR you can do it in the constructor.
    private int myBase;     
    private int myHeight;
    // constructors
    public Triangle()
    {
        //  Implicit call to 'Two_D_Shape' default constructor right HERE! 
        //  Basically, invisible right here is:  super();  
        setMyBase(0);  
        setMyHeight(0);  
    }

    public Triangle( int x, int y, int height, int base )
    {     
        super(x,y);
        setMyBase(height);  
        setMyHeight(base);  
    }

    public void finalize()
    {
        super.finalize();
    }   

    // NOTE: Overridden getMyShapeStats() 
    public String getMyShapeStats()  
    {
        return MY_SHAPE + " @ " +  getMyPoint() + 
        "   height = " + getMyHeight() + 
        "   base = " + getMyBase() + "   area = " + getArea() + "\n";     
    }

    public String getArea() // REM: DecimalFormat returns a "String!"
    {
        DecimalFormat precision2 = new DecimalFormat( "0.00" );

        return precision2.format((getMyBase() * getMyHeight()) / 2);
    }

    // toString
    public String toString()
    {
        return getMyShapeStats();
    }

    // set method
    public void setMyHeight( int height )
    {
        myHeight = height;
    }
    public void setMyBase( int base )
    {
        myBase = base;
    }

    // get method
    public int getMyHeight()
    {
        return myHeight;
    }
    public int getMyBase()
    {
        return myBase;
    }

    // ERROR!!!
    //public Point getMyPoint()  // NOTE: This 'final' method was declared in Shape
    //{                          //       so we can NOT do it here!
    //     return myPoint;    
    //}
    /* public double getArea()
    {
    return (Math.pow(getMySide,2));
    }*/

}  // end class Circle

