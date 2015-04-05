public class Line_CLIENT
{
    public static void main()
    {
        Line lin1, lin2;
        Point p1, p2, p3, p4;
        int x1=5, y1=5, x2=10, y2=0;
    
        // -------- Constructors --------
        p1 = new Point(0,0);
        p2 = new Point(5,5);    
        lin1 = new Line(p1,p2);
        lin2 = new Line(x1, y1, x2, y2);
                
        // -------- Outputs --------
        System.out.println(" lin1's p1 = " + lin1.getP1());
        System.out.println(" lin1's p2 = " + lin1.getP2());    
        System.out.println(" lin1 = " + lin1);        
        System.out.println("\n");
        System.out.println(" lin2's p1 = " + lin2.getP1());
        System.out.println(" lin2's p2 = " + lin2.getP2());    
        System.out.println(" lin2 = " + lin2);        
        System.out.println("\n");        
       
        // -------- Slope --------
        System.out.println("lin1's slope = " + lin1.getSlope());
        System.out.println("lin2's slope = " + lin2.getSlope());
        System.out.println("\n");        
        
        // -------- isCollinear --------
        p3 = new Point(3,3);
        System.out.println("Is lin1 collinear with p3"+ p3 + "?");
        System.out.println("Answer = " + lin1.isCollinear(p3));
        p4 = new Point(2,10);
        System.out.println("Is lin1 collinear with p4"+ p4 + "?");
        System.out.println("Answer = " + lin1.isCollinear(p4));
    }
  
}