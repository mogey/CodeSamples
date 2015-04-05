
/**
 * (1) Have the Scalene class extend Triangles.  
 * (2) Write 2 constructors:  (a) the default that calls the super classes default 
 *     constructor and (b) One that takes in 2 doubles representing the base and 
 *     the height.  It should then call the super classes constructor with these 
 *     2 arguments.
 * (3) Override the method getMyType() that returns "Scalene"
 */

public class Trapezoid extends Quadrilaterals
{  

    // Constructors
    Trapezoid()
    {}
    Trapezoid(double base1, double base2, double height){
        super(base1, base2, height);
    }
    // Overide abstract method    
    public String getMyType(){
        return "Trapezoid";
    }
    public void calculateArea(){
         setMyArea(((getMyBase1() + getMyBase2()) / 2 ) * getMyHeight());
    }
    public String toString()
    {
        return getMyType() + " and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }

}

