public class GroceryList
{
    private GroceryItemOrder[] orders = new GroceryItemOrder[10];
    private int orderCount = 0;
    public GroceryList(){
        
    }
    public void add(GroceryItemOrder newOrder){
       
         this.orders[this.orderCount] = newOrder;
         this.orderCount++;
    }
    public double getTotalCost(){
        double totalCost = 0.0;
        for(int i = 0; i < this.orders.length; i++){
            if(this.orders[i] != null){
                totalCost += this.orders[i].getCost() * this.orders[i].getQuantity();
            }
        }
        return totalCost;
    }
    public String toString(){
        String returnStr = "";
        for(int i = 0; i < this.orders.length; i++){
            if(this.orders[i] != null){
                returnStr += this.orders[i].toString() + "\n";
            }
        }
        return returnStr;
    }
}