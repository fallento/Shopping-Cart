public class ItemOrder{
   private Item item;
   private int quantity;
   //makes an order of items
   public ItemOrder(Item item, int quantity){
      this.item = item;
      this.quantity = quantity;
   }
   //returns the price of one order
   public double getPrice(){
      return item.priceFor(quantity);
   }
   //return one item
   public Item getItem(){
      return item;   
   }

}