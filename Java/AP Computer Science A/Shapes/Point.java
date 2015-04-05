public class Point
{
private int myX, myY;

   // Constructors
   public Point()
   {
        myX = myY = 0;    
   }
   public Point (int x, int y)
   {
        myX = x;
        myY = y;
   }
   
   // toString
   public String toString()
   {
        return "(" + getX() + "," + getY() + ")";    
   }
   
  // set coordinates
   public void setX( int x )
   {
      myX = x;
   }
   public void setY( int y )
   {
      myY = y;
   }

   // get coordinates
   public int getX()
   {
      return myX;
   }
   public int getY()
   {
      return myY;
   }

}
