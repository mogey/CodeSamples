
/**
 * Mr. Marques
 *  Quadrilaterals is "abstract" because you can NOT have 'just' a Quadrilaterals. It has to
 *  be of a certain type. This is why there are no abstract methods in this abstract
 *  class.
 * 
 */

/* 
(1) Write the abstract 'Quadrilaterals' class and have it implement 'Polygon_Comparable'
(2) Declare 4 instance variables all of type double: myBase1, myBase2, myHeight, and myArea.
(3) Write 2 constructors: the default and a 3 parameter one that utilizes the set methods 
that sets everything to 0 or its parameter list.
(4) Write/implement getMyCategory() returns "Triangles"
NOTE: Write/implement getMyType() in EACH of the subclasses and NOT here!
(5) Write 'compareTo()' which compares 2 polygons via their area.
 */
public abstract class Quadrilaterals implements Polygon_Comparable
{
    private double myBase1;
    private double myBase2;
    private double myHeight;
    private double myArea;

    // ---------------------- constructor ---------------------
    // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<
    Quadrilaterals(){}
    Quadrilaterals(double base1, double base2, double height){
        setMyBase1(base1);
        setMyBase2(base2);
        setMyHeight(height);
    }

    // ************ abstract method(s) & the overiding of such *************
    // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<< 
    public String getMyCategory(){
        return "Quadrilaterals";
    }
    public abstract String getMyType();

    // ********************* Assessor and Mutator methods *************************
    public void setMyBase1(double b1)
    {
        myBase1 = b1;
    }

    public void setMyBase2(double b2)
    {
        myBase2 = b2;
    }    

    public void setMyHeight(double h)
    {
        myHeight = h; 
    }

    public void setMyArea(double a)
    {
        myArea = a;
    }

    public double getMyBase1()
    {
        return myBase1;
    }

    public double getMyBase2()
    {
        return myBase2;
    }

    public double getMyHeight()
    {
        return myHeight;
    }    

    public double getMyArea()
    {
        calculateArea();  // Always calculateArea() first.
        return myArea;
    }

    // ******* abstract method calculateArea() to be overriden written    
    // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<    
    public abstract void calculateArea();
    // ************************* compareTo() *************************************
    // >>>>>>>>>>>>>> YOUR CODE HERE <<<<<<<<<<<<<<<<<<<<
    // ************************** toString() ******************************
    public String toString() 
    { 
        return "Quadrilateral and I am also a Polygon_Comparable";
    }      

}

