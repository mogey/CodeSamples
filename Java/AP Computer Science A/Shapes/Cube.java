import java.text.DecimalFormat;

// Definition of class Square.
public final class Cube extends Three_D_Shape
{

    private final String MY_SHAPE = "Cube";  //You can initialize here
    //OR you can do it in the constructor.
    private int mySides;     
    // constructors
    public Cube()
    {
        //  Implicit call to 'Two_D_Shape' default constructor right HERE! 
        //  Basically, invisible right here is:  super();  
        setMySides(0);      
    }

    public Cube( int x, int y, int sides )
    {     
        super(x,y);
        setMySides(sides);
    }

    public void finalize()
    {
        super.finalize();
    }   

    // NOTE: Overridden getMyShapeStats() 
    public String getMyShapeStats()  
    {
        return MY_SHAPE + " @ " +  getMyPoint() + 
        "   sides = " + getMySides() + "   volume = " + getVolume() + "\n";     
    }

    public String getVolume() // REM: DecimalFormat returns a "String!"
    {
        DecimalFormat precision2 = new DecimalFormat( "0.00" );

        return precision2.format(Math.pow(getMySides(),3));
    }

    // toString
    public String toString()
    {
        return getMyShapeStats();
    }

    // set method
    public void setMySides( int radi )
    {
        mySides = radi;
    }

    // get method
    public double getMySides()
    {
        return mySides;
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

