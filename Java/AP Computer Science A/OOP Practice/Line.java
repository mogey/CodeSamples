public class Line
{
    private Point p1 = new Point();
    private Point p2 = new Point();
    public Line()
    {
        
    }
    public Line(Point a, Point b){
        this.p1 = a;
        this.p2 = b;
    }
    public Line(int x1, int y1, int x2, int y2){
        this.p1.setLocation(x1,y1);
        this.p2.setLocation(x2,y2);
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
    public double getSlope(){
        return this.p1.slope(this.p2);
    }
    public boolean isCollinear(Point other){
        return this.p1.isCollinear(this.p2, other);
    }
    public String toString(){
        return "[" + p1 + ", " + p2 + "]";
    }
}