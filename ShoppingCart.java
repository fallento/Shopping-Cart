  import java.util.*;
  public class ShoppingCart{
     private boolean discount;
     private Item item;
     private ArrayList<ItemOrder> list;
     //constructor
     public ShoppingCart(){
        list = new ArrayList<ItemOrder>();
     }
    //replaces an item if there is one or adds a new item to the list
    public void add(ItemOrder order){
       boolean b = false;
       int index = -1;
       for(int i = 0; i < list.size();i++){
           if(order.getItem()== list.get(i).getItem()){
            b = true;
            index = i;
            break;
           }
       }
       if(b)
         list.set(index,order);
       else
         list.add(order);
      
    }
    //gets the discount if the box is checked
    public void setDiscount(boolean bool){
       if(discount)
          discount = bool;
       else
          discount = bool;
    } 
    //gets the total of the wholel cart
    public double getTotal(){
       double total = 0;
       for(int i = 0;i < list.size();i++){
         total+=list.get(i).getPrice();
       }
       if(discount){
         return total*.90;
       }
       else{
         return total;
       }
    }

 }