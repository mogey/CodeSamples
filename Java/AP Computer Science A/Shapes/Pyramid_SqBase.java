import java.text.DecimalFormat;

// Definition of class Square.
public final class Pyramid_SqBase extends Three_D_Shape
{

private final String MY_SHAPE = "Pyramid Square Base";  //You can initialize here
                                           //OR you can do it in the constructor.
private int myBase;     
private int myHeight;
   // constructors
   public Pyramid_SqBase()
   {
      //  Implicit call to 'Two_D_Shape' default constructor right HERE! 
      //  Basically, invisible right here is:  super();  
      setMyHeight(0);      
      setMyBase(0);
   }
   public Pyramid_SqBase( int x, int y, int base, int height )
   {     
       super(x,y);
       setMyHeight(height);
       setMyBase(base);
   }
   public void finalize()
   {
       super.finalize();
   }   

   // NOTE: Overridden getMyShapeStats() 
   public String getMyShapeStats()  
   {
      return MY_SHAPE + " @ " +  getMyPoint() + 
            "   base = " + getMyBase() + 
            "   height = " + getMyHeight() + "   volume = " + getVolume() + "\n";     
   }

   public String getVolume() // REM: DecimalFormat returns a "String!"
   {
   DecimalFormat precision2 = new DecimalFormat( "0.00" );
     
      return precision2.format((Math.pow(getMyBase(),2) * getMyHeight()) /3);
   }
   
   // toString
   public String toString()
   {
       return getMyShapeStats();
   }
      
   // set method
   public void setMyBase( int base )
   {
      myBase = base;
   }

   // get method
   public double getMyBase()
   {
      return myBase;
   }
   public void setMyHeight( int height )
   {
      myHeight = height;
   }

   // get method
   public double getMyHeight()
   {
      return myHeight;
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


