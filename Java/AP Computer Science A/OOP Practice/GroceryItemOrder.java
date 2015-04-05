// ==================================================


/**
 * GroceryItemOrder here.
 * Building Java Programs
 * Chapter 8 #3  pg554
 * 
 */

public class GroceryItemOrder
{
    private String name;
    private int quantity;
    private double pricePerUnit;

    // ----------- Constructors -----------
    public GroceryItemOrder()
    {
        this.name="";
        this.quantity=0;
        this.pricePerUnit=0;
    }
    public GroceryItemOrder(String name,int quantity,double pricePerUnit)
    {
            this.name = name;
            this.quantity = quantity;
            this.pricePerUnit = pricePerUnit;
        }    
    
    // ----------- Helper Methods -----------
    public double getCost()
    {
            return this.pricePerUnit;
    }
    public void setQuantity(int quantity)
    {
            this.quantity = quantity;
    }   
    public int getQuantity()
    {
            return this.quantity;
    }  
    // ---------------- toString -------------------------    
    public String toString()
    {   
        String nameTab;    
        nameTab = (this.name.length() <= 7 ? "\t\t" : "\t");
        return this.name + nameTab + this.quantity + "\t" + " $" + this.pricePerUnit; 
    }
  
}
