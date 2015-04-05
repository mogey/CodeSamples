
/**
 * Mr. Marques
 *  Triangles is "abstract" because you can NOT have 'just' a Triangle. It has to
 *  be of a certain type. This is why there are no abstract methods in this abstract
 *  class.
 */

/*
(1) Write the abstract 'Triangles' class and have it implement 'Polygon_Comparable' 
(2) It has 3 instance variables all of type double: myBase, myHeight, and myArea.
(3) It has 2 constructors: the default and one that takes in 2 doubles for the base and height.
(4) Write/implement getMyCategory() returns "Triangles"
NOTE: Write/implement getMyType() in EACH of the subclasses and NOT here!
(5) Write 'compareTo()' which compares 2 polygons via their area.
 */

// Class heading   
public abstract class Triangles implements Polygon_Comparable
{
    // Instance variables
    // 
    private double myBase;
    private double myHeight;
    private double myArea;

    // *********** Constructors ****************
    // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<
    Triangles(){}
    Triangles(double base, double height){
        setMyBase(base);
        setMyHeight(height);
    }

    // ************ abstract getMyCategory() and getMyType() methods overidem *************
    //
    public String getMyCategory(){
        return "Triangles";
    }
    public abstract String getMyType();

    // **************** Accessor/Mutator Methods ****************    
    // ---- overriden abstract methods calculateArea() & getMyArea() ----
    public void calculateArea()
    {
        myArea = 0.5 * myBase * myHeight;    
    }  

    public double getMyArea()
    {     
        calculateArea(); // Always calculateArea() first.
        return myArea;
    }  

    public double getMyBase()
    {
        return myBase;
    }

    public void setMyBase(double b)
    {
        myBase = b;
    }

    public void setMyHeight(double h)
    {
        myHeight = h;
    }

    // ************************* compareTo() *************************************

    //>>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<

    // ************************** toString() ******************************
    public String toString() 
    { 
        return "Triangle and I am also a Polygon_Comparable.";
    }

} // class Triangles

