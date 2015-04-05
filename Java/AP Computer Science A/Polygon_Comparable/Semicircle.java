
/**
 * (1) Have the Scalene class extend Triangles.  
 * (2) Write 2 constructors:  (a) the default that calls the super classes default 
 *     constructor and (b) One that takes in 2 doubles representing the base and 
 *     the height.  It should then call the super classes constructor with these 
 *     2 arguments.
 * (3) Override the method getMyType() that returns "Scalene"
 */

public class Semicircle extends Rounds
{  

    // Constructors
    Semicircle()
    {}
    Semicircle(double radius){
        super(radius);
    }
    // Overide abstract method    
    public String getMyType(){
        return "Semicircle";
    }
    public String toString()
    {
        return getMyType() + " and I am also a " + super.toString() + " AND my area = " + getMyArea();
    }
    public void calculateArea(){
        
    }

}

