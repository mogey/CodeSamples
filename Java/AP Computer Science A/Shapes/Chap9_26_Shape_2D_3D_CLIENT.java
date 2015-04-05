/**
 * 
 * Chap9_26_Shape_2D_3D_CLIENT
 * Deitel 4th Edition
 * Chap 9 #26,  pg 533
 * 
 * Write a program that will work in sync with the main() code and the
 * specifics given below. 
 * 
 * (1) Use the main() given below and MATCH the output given.
 * (2) Use the following specifics (what it 'has') for the given classes.
 * 
 *    Point:
 *      - (x,y) symbolizing position of the Object
 *      
 *    Shape:
 *      - abstract class.
 *      - Point object (x,y) compositioned within.
 *      - static var myShapeCount keeping the count of ALL shapes constructed.
 *      - static int getMyShapeCount() method that returns myShapeCount
 *      - 2 constructors: (1) default constructor that instantiates a new Point
 *          calling Point's default constructor & (2) a two parameter list (x & y)
 *          constructor that creates a new Point with the given values.         
 *      - toString() that tells/calls a method to tell the proper information.
 *      - abstract String getMyShapeStats() which will return a String stating the 
 *        total Shape count.
 * 
 *    Two_D_Shape:
 *      - abstract class.
 *      - static var my2DShapeCount keeping the count of 2D shapes constructed.
 *      - 2 constructors: (1) default constructor that creates a Shape object and 
 *        (2) a two parameter list (x & y) constructor that calls Shape's constructor         
 *      - toString() that tells/calls any methods to output the proper information.    
 *      - implement method getMyShapeStats() which returns a String stating the 
 *        total 2D-Shape count AND the total Shape count.
 *      - abstract String getArea();   // YES! String. See below.
 * 
 *    Three_D_Shape:
 *      - abstract class.       
 *      - static var my3DShapeCount keeping the count of 3D shapes constructed.
 *      - 2 constructors: (1) default constructor that creates a Shape object and 
 *        (2) a two parameter list (x & y) constructor that calls Shape's constructor         `
 *      - toString() that tells/calls any methods to output the proper information.  
 *      - implements method getMyShapeStats() which returns a String stating the 
 *        total 3D-Shape count AND the total Shape count.
 *      - abstract String getVolume();   // YES! String. See below.
 * 
 *    Each of the shapes (Square, Circle, Triangle, Cube, Sphere, & Pyramid_SqBase) 
 *    are to have the following:
 *      - these classes should guarantee that no other class can inherit from them / be a subclass to them.
 *        (Thus, make them 'final' like Employee program in the book.
 *      - hold their own information such as 'side', 'radius', etc.
 *      - toString() that tells/calls a method to tell the proper information.     
 *      - implements method getMyShapeStats().
 *      - implements getArea() or getVolume() returning a String (this is what 'DecimalFormat'
 *        returns, as it is needed to get the 2 decimal placement percision).
 * 
 * NOTE: Any method that is not going to be overridden in a subclass should be declared 'final'.
 *       Any var that is meant to be a constant should be declared final.
 *       
 * The constructors are:
 *    2D: Circle(x,y,radius), Square(x,y,side), Triangle(x,y,base,height)
 *    3D: Sphere(x,y,radius), Cube(x,y,side), Pyramid_SqBase(x,y,side, height)

OUTPUT:
2D Shape Count = 0
3D Shape Count = 0
TOTAL Shape Count = 0

Square @ (1,2)   side = 3.0   area = 9.00
2-D Shape Count = 1
TOTAL Shape count = 1

(shapes[0] instanceOf Square) ==> YES!!
(shapes[0] instanceOf Two_D_Shape) ==> YES!!
(shapes[0] instanceOf Three_D_Shape) ==> NO!!
(shapes[0] instanceOf Shape) ==> YES!!

Cube @ (4,5)   side = 6.0   = 216.00
3-D Shape Count = 1
TOTAL Shape count = 2

2D Shape Count = 1
3D Shape Count = 1
TOTAL Shape Count = 2

Circle @ (7,8)   radius = 9.0   area = 254.47
2-D Shape Count = 2
TOTAL Shape count = 3

(circle instanceOf Shape) ==> YES!!
Sphere @ (10,11)   radius = 12.0   volume = 7238.23
3-D Shape Count = 2
TOTAL Shape count = 4

Triangle @ (13,14)  base = 15.0  height = 16.0   area = 120.00
2-D Shape Count = 3
TOTAL Shape count = 5

Pyramid_SqBase @ (17,18)   side = 19.0   height = 20.0   volume = 2406.67
3-D Shape Count = 3
TOTAL Shape count = 6

====>  finalize my3DShapeCount= 2
====>  finalize my2DShapeCount= 2
====>  finalize my3DShapeCount= 1
====>  finalize my2DShapeCount= 1
====>  finalize my3DShapeCount= 0
====>  finalize my2DShapeCount= 0

 */
public class Chap9_26_Shape_2D_3D_CLIENT
{

    public static void main()
    { 
        //final double E = 1.0e-15;
        Shape shapes[] = new Shape[6];  // make 6 slots to hold the Shapes - defaulted to 'null'   
        // OR you could use and ArrayList: ArrayList<Shape> s = new ArrayList<Shape> ();                         

        System.out.println(" 2D Shape Count = " + Two_D_Shape.getMyShapeCount());
        System.out.println(" 3D Shape Count = " + Three_D_Shape.getMyShapeCount());        
        System.out.println(" TOTAL Shape Count = " + Shape.getMyShapeCount());
        System.out.println();

        //Two_D_Shape twoD = new Two_D_Shape();  //ERROR!!

        shapes[0] = new Square(1,2,3);  // new Two_D_Shape();    ERROR!!!
        System.out.println(shapes[0] + "\n");   
        System.out.println(" 2D Shape Count = " + Two_D_Shape.getMyShapeCount());
        System.out.println(" 3D Shape Count = " + Three_D_Shape.getMyShapeCount());        
        System.out.println(" TOTAL Shape Count = " + Shape.getMyShapeCount());
        System.out.println();

        if (shapes[0] instanceof Square)
            System.out.println("(shapes[0] instanceOf Square) ==> YES!!");
        else
            System.out.println("(shapes[0] instanceOf Square) ==> NO!!");
        if (shapes[0] instanceof Two_D_Shape)
            System.out.println("(shapes[0] instanceOf Two_D_Shape) ==> YES!!");
        else
            System.out.println("(shapes[0] instanceOf Two_D_Shape) ==> NO!!");             
        if (shapes[0] instanceof Three_D_Shape)
            System.out.println("(shapes[0] instanceOf Three_D_Shape) ==> YES!!");
        else
            System.out.println("(shapes[0] instanceOf Three_D_Shape) ==> NO!!");            
        if (shapes[0] instanceof Shape)
            System.out.println("(shapes[0] instanceOf Shape) ==> YES!!");
        else
            System.out.println("(shapes[0] instanceOf Shape) ==> NO!!");               
        System.out.println("\n\n");

        shapes[1] = new Cube(4,5,6);         
        System.out.println(shapes[1] + "\n");        
        System.out.println(" 2D Shape Count = " + Two_D_Shape.getMyShapeCount());
        System.out.println(" 3D Shape Count = " + Three_D_Shape.getMyShapeCount());        
        System.out.println(" TOTAL Shape Count = " + Shape.getMyShapeCount());
        System.out.println();

        System.out.println(" 2D Shape Count = " + Two_D_Shape.getMyShapeCount());
        System.out.println(" 3D Shape Count = " + Three_D_Shape.getMyShapeCount());        
        System.out.println(" TOTAL Shape Count = " + Shape.getMyShapeCount());
        System.out.println();        

        Circle circle = new Circle(7,8,9);                  
        shapes[2] = circle;
        System.out.println(shapes[2] + "\n");   
        System.out.println(" 2D Shape Count = " + Two_D_Shape.getMyShapeCount());
        System.out.println(" 3D Shape Count = " + Three_D_Shape.getMyShapeCount());        
        System.out.println(" TOTAL Shape Count = " + Shape.getMyShapeCount());
        System.out.println();

        if (circle instanceof Shape)
            System.out.println("(circle instanceOf Shape) ==> YES!!");
        else
            System.out.println("(circle instanceOf Shape) ==> NO!!");            

        Sphere sphere = new Sphere(10,11,12);  
        shapes[3] = sphere;
        System.out.println(shapes[3] + "\n");         

        Two_D_Shape triangle = new Triangle(13,14,15,16);
        shapes[4] = triangle;
        System.out.println(shapes[4] + "\n");       
        System.out.println(" 2D Shape Count = " + Two_D_Shape.getMyShapeCount());
        System.out.println(" 3D Shape Count = " + Three_D_Shape.getMyShapeCount());        
        System.out.println(" TOTAL Shape Count = " + Shape.getMyShapeCount());
        System.out.println();

        Three_D_Shape pyramid = new Pyramid_SqBase(17,18,19,20);
        shapes[5] = pyramid;
        System.out.println(shapes[5] + "\n");            
        System.out.println(" 2D Shape Count = " + Two_D_Shape.getMyShapeCount());
        System.out.println(" 3D Shape Count = " + Three_D_Shape.getMyShapeCount());        
        System.out.println(" TOTAL Shape Count = " + Shape.getMyShapeCount());
        System.out.println();

        System.gc();  // Explicit Call to System.gc() calls the finalizers - 
        // Would be called Implicitly anyway. 
        System.out.println(" 2D Shape Count = " + Two_D_Shape.getMyShapeCount());
        System.out.println(" 3D Shape Count = " + Three_D_Shape.getMyShapeCount());        
        System.out.println(" TOTAL Shape Count = " + Shape.getMyShapeCount());
        System.out.println();

    } // main
} // Chap9_26_Shape_2D_3D_CLIENT

