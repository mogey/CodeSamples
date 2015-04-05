// Program tests class Rational.
// RationalTest   BJP Chap 8 #1
/*
 NOTE: 
      (1) You will have to return a Rational from each method, because neither r1 nor r2
          should change when you add them together, or so.  Instead, another Rational is
          created and returned to 'result'.  This is true for subtraction, multiplication, and 
	division, too. 
      (2) The call to "toString()" is NOT really needed. It gets called implicitly,
          anyway, remember!!
      (3) You can NOT divide by 0!  Make sure that this does NOT happen!!
      (4) ALL rationals MUST be in lowest terms!
      (5) Improper fractions are OK!
      
      OUTPUT:      
      1/2 + 3/4 = 5/4 OR as a decimal: 1.25

      1/2 - 3/4 = -1/4 OR as a decimal: -0.25  (note: -2/8 => -1/4 in lowest terms!!)

      1/2 * 3/4 = 3/8 OR as a decimal: 0.375

      1/2 / 3/4 = 2/3 OR as a decimal: 0.6666666666666666
 
*/

// Java extension packages
import javax.swing.*;

public class Rational_Chap8_ProgProject_1_CLIENT
{

   // CLIENT
   public static void main()
   {
   Rational r1 = new Rational(1,2), r2 = new Rational(3,4);
   Rational result;

      // perform calculations
         result = r1.sum( r2 );
         System.out.println( r1.toString() + " + " + r2.toString() + " = " + result.toString() + 
             " OR as a decimal: " + result.toFloatString() + "\n");

         result = r1.subtract( r2 );
         System.out.println( r1 + " - " + r2.toString() + " = " + result + 
             " OR as a decimal: " + result.toFloatString() + "\n");

         result = r1.multiply( r2 );
         System.out.println( r1.toString() + " * " + r2 + " = " + result + " OR as a decimal: " + result.toFloatString() + "\n");

         result = r1.divide( r2 );
         System.out.println( r1 + " / " + r2 + " = " + result + " OR as a decimal: " + result.toFloatString() + "\n");
            
        } // main

}  // end class RationalTest
