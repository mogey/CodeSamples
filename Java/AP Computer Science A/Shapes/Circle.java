import java.text.DecimalFormat;

// Definition of class Square.
public final class Circle extends Two_D_Shape
{

private final String MY_SHAPE = "Circle";  //You can initialize here
                                           //OR you can do it in the constructor.
private int myRadius;     
private final double PI = 3.14;
   // constructors
   public Circle()
   {
      //  Implicit call to 'Two_D_Shape' default constructor right HERE! 
      //  Basically, invisible right here is:  super();  
      setMyRadius(0);      
   }
   public Circle( int x, int y, int radi )
   {     
       super(x,y);
       setMyRadius(radi);
   }
   public void finalize()
   {
       super.finalize();
   }   

   // NOTE: Overridden getMyShapeStats() 
   public String getMyShapeStats()  
   {
      return MY_SHAPE + " @ " +  getMyPoint() + 
            "   radius = " + getMyRadius() + "   area = " + getArea() + "\n";     
   }

   public String getArea() // REM: DecimalFormat returns a "String!"
   {
   DecimalFormat precision2 = new DecimalFormat( "0.00" );
     
      return precision2.format(PI * Math.pow(getMyRadius(),2));
   }
   
   // toString
   public String toString()
   {
       return getMyShapeStats();
   }
      
   // set method
   public void setMyRadius( int radi )
   {
      myRadius = radi;
   }

   // get method
   public double getMyRadius()
   {
      return myRadius;
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


