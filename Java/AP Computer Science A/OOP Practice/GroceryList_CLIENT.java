/**
 * Write a description of class Grocery_CLIENT here.
 * Building Java Programs
 * Chapter 8 #3  pg554
 * 
 * OUTPUT:
 * milk             2    $2.99
 * bread            4    $1.59
 * chicken breast   3    $5.99
 * veggie mix       2    $3.25
 * potatoes         4    $0.75
 * cookies          5    $1.5
 * 
 * gList.getTotalCost() = $47.31
 * 
 */

public class GroceryList_CLIENT
{

    public static void main()
    {
    GroceryList gList = new GroceryList();
    
        addGroceryItemOrders(gList);
        
        System.out.println(gList);
        System.out.println("\n\n");
        System.out.println("gList.getTotalCost() = $" + gList.getTotalCost());     
    }
    
    public static void addGroceryItemOrders(GroceryList gList)
    {
        gList.add(new GroceryItemOrder("milk", 2, 2.99));
        gList.add(new GroceryItemOrder("bread", 4, 1.59));
        gList.add(new GroceryItemOrder("chicken breast", 3, 5.99));
        gList.add(new GroceryItemOrder("veggie mix", 2, 3.25));
        gList.add(new GroceryItemOrder("potatoes", 4, 0.75 ));
        gList.add(new GroceryItemOrder("cookies", 5, 1.50));        
        
    }
  
}

