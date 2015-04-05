public class Point_CLIENT2
{
    public static void main()
    {
        Point p1, p2, p3, p4, p5;
        
        //  ------------------------    findQuadrant ------------------------ 
        // ---- p1 ----
        p1 = new Point(1,2);
        System.out.println("p1 = " + p1.toString());
        int q = p1.findQuadrant();
        if (q != -1){
        System.out.println(p1 + " is in Quadrant " + q);
        }else{
        System.out.println(p1 + " lies on an axis.");
        }
        // ---- p2 ----
        p2 = new Point(0,2);
        System.out.println("p2 = " + p2);
        q = p2.findQuadrant();
        if (q != -1){
        System.out.println(p2 + " is in Quadrant " + q);
        }else{
        System.out.println(p2 + " lies on an axis.");
        }
        System.out.println("\n");
        
        // --------------------- flip( )  --------------------- 
        p1.flip();
        System.out.println(" p1 [after flip()]= " + p1.toString());        
        System.out.println("\n");
        
        // --------------------- translate( )  --------------------- 
        p1.translate(1,3);
        System.out.println(" p1 = " + p1);      
        System.out.println("\n");
        
        // ---------------------distanceFromOrigin() --------------------- 
        System.out.println(" p1 distance from origin = " + p1.distanceFromOrigin());
        System.out.println("\n");
        
        // --------------------- manhattanDistance() --------------------- 
        int distance = p1.manhattanDistance(p2);
        System.out.println(" p1.manhattanDistance(p2) = " + distance);
        System.out.println("\n");
        
        // ---------------------  setLocation( ) / slope( )  --------------------- 
        p2.setLocation(7,8);        
        System.out.println("slope between p1" + p1 + " and p2" + p2 + " = " + 
        p1.slope(p2));
        System.out.println("\n");
        
        // --------------------- manhattanDistance( ) --------------------- 
        System.out.println("The manhattanDistance between p1" + p1 + " and p2" + p2 + " = "  +
        p1.manhattanDistance(p2));
        System.out.println("\n");
        
        // ---------------------  isVerticle( )   --------------------- 
        System.out.println("Is  p1" + p1 + " verticle to p2" + p2 + 
        " ? Answer = " + p1.isVerticle(p2));  
        p3 = new Point(4,10);
        System.out.println("Is  p1" + p1 + " verticle to p3" + p3 + 
        " ? Answer = " + p1.isVerticle(p3));    
        System.out.println("\n");
        
        // --------------------- slope( ) --------------------- 
        System.out.println("The slope between p1" + p1 + " and p2" + p2 + " = "  +
        p1.slope(p2));
        System.out.println("\n");
        
        // --------------------- isColinear( ) --------------------- 
        p1.setLocation(0,0);
        p2.setLocation(5,5);
        p3.setLocation(3,3);
        //   p4.setLocation(0,0);   ←- Error.  Why?
        p4 = new Point(2,5);
        
        System.out.println(" Does p3" + p3 + " lie on the same line as p1" + p1 + " and p2" + p2 + " Answer = " + p3.isCollinear(p1, p2));
        System.out.println(" Does p4" + p4 + " lie on the same line as p1" + p1 + " and p2" + p2 + " Answer = " + p4.isCollinear(p1, p2));

    }  // main
} // Point_CLIENT