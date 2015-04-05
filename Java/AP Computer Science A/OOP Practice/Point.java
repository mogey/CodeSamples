public class Point{
    private int x;
    private int y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(int newx, int newy){
        this.x = newx;
        this.y = newy;
    }
    public int findQuadrant(){
        if (this.y > 0){
            if(this.x > 0){
                return 1;
            }
            if(this.x < 0){
                return 2;
            }
        }
        if (this.y < 0) {
            if(this.x > 0){
                return 4;
            }
            if(this.x < 0){
                return 3;
            }
        }
        return 0;
    }
    public void flip(){
        int temp = this.x;
        this.x = this.y;
        this.y = temp;
    }
    public void translate(int newX, int newY){
        this.x += newX;
        this.y += newY;
    }
     public double slope(Point p2){
        double y2y1 = this.y - p2.getY();
        double x2x1 = this.x - p2.getX();
        return y2y1/x2x1;
    }
    public double distanceFromOrigin(){
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }
    public int getY(){
        return this.y;
    }
    public int getX(){
        return this.x;
    }
    public void setLocation(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }
    public int manhattanDistance(Point other){
        return Math.abs(this.x - other.getX()) + Math.abs(this.y - other.getY());
    }
    public boolean isVerticle(Point other){
        if (this.x == other.getX()){
            return true;
        }
        return false;
    }
    public boolean isCollinear(Point p1, Point p2){
        if (this.x == 0 && p1.getX() == 0 && p2.getX() == 0){
            return true;
        }
        else if(this.slope(p1) == p1.slope(p2)){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}