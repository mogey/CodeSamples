import java.text.DecimalFormat;

// Definition of class Square.
public final class Square extends Two_D_Shape
{

private final String MY_SHAPE = "Square";  //You can initialize here
                                           //OR you can do it in the constructor.
private int mySide;                                       
   // constructors
   public Square()
   {
      //  Implicit call to 'Two_D_Shape' default constructor right HERE! 
      //  Basically, invisible right here is:  super();  
      setMySide(0);      
   }
   public Square( int x, int y, int side )
   {     
       super(x,y);
       setMySide(side);
   }
   public void finalize()
   {
       super.finalize();
   }   

   // NOTE: Overridden getMyShapeStats() 
   public String getMyShapeStats()  
   {
      return MY_SHAPE + " @ " +  getMyPoint() + 
            "   side = " + getMySide() + "   area = " + getArea() + "\n";     
   }

   public String getArea() // REM: DecimalFormat returns a "String!"
   {
   DecimalFormat precision2 = new DecimalFormat( "0.00" );
     
      return precision2.format(getMySide() * getMySide());
   }
   
   // toString
   public String toString()
   {
       return getMyShapeStats();
   }
      
   // set method
   public void setMySide( int side )
   {
      mySide = side;
   }

   // get method
   public double getMySide()
   {
      return mySide;
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


