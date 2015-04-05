// ------------------------------ IntegerSet_Chap8_17_CLIENT --------------------------------

/**
 * IntegerSet_Chap8_17_CLIENT
 * Deitel 4th Edition
 * Chap 8 #17 pg443
 * 
 * IntegerSet objects contain a boolean array of length 10. Thus, we allow ONLY the 
 * numbers 0 thru 9 to be in the set where a[i] is true if that element is in the set.
 * This client performs simple set operations on the objects.
 *  
 *  
 *  OUTPUT should be:
 *  
 Set a: {1, 2, 3, 4, 5, }
 Set b: {2, 4, 6, 8, }
 The union of A and B is Set c: {1, 2, 3, 4, 5, 6, 8, }
 The intersection of A and B is Set d: {2, 4, }

 Set A is NOT equal to set B.

 Set C is NOT equal to set D.

Inserting 7 into set A...
Set A is now: {1, 2, 3, 4, 5, 7, }

Deleting 7 into set A...
Set A is now: {1, 2, 3, 4, 5, }

 Set E is: {0, 9, }

 Set F is: {---}

 *  
*/

public class  IntegerSet_Chap8_17_CLIENT
{
   public static void main() 
   {
   IntegerSet a, b, c, d, e, f;

   // create the sets.
   a = new IntegerSet(1,2,3,4,5);
   b = new IntegerSet(2,4,6,8);
   e = new IntegerSet(2,3,6,8);  
   f = new IntegerSet();
   
    // Input the set
    //a.inputIntegerSet();   // input 1,2,3,4,5
   // b.inputIntegerSet();   // input 2,4,6,8

    // output the sets
    System.out.println(" Set a: " + a.printIntegerSet());    // a: 1,2,3,4,5
    System.out.println(" Set b: " + b.printIntegerSet());    // b: 2,4,6,8
    
    // find the union of the sets
    c = a.unionOfIntegerSets(b);        // c: 1,2,3,4,5,6,8
    d = a.intersectionOfIntegerSets(b); // d: 2,4

    // output the sets
    System.out.println(" The union of A and B is Set c: " + c.printIntegerSet());    // c: 1,2,3,4,5,6,8
    System.out.println(" The intersection of A and B is Set d: " + d.printIntegerSet());    // d: 2,4

    if (a.isEqualTo(b))
        System.out.println( "\n Set A is equal to set B.");
    else 
        System.out.println( "\n Set A is NOT equal to set B.");
        
    if (c.isNotEqualTo(d))
        System.out.println( "\n Set C is NOT equal to set D.");
    else 
        System.out.println( "\n Set C is equal to set D.");        

    System.out.println( "\nInserting 7 into set A...");
    a.insertElement(7);   // a: 1,2,3,4,5,7
    System.out.println( "Set A is now: " + a.printIntegerSet());

    System.out.println( "\nDeleting 7 into set A...");
    a.deleteElement(7);   // a: 1,2,3,4,5
    System.out.println( "Set A is now: " + a.printIntegerSet());  // a: 1,2,3,4,5
    
    System.out.println( "\n Set E is: " + e.printIntegerSet()); // e: 2, 3, 6, 8
        
    System.out.println( "\n Set F is: "+  f.printIntegerSet()); // ---
  }


}