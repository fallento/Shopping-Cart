import java.text.*;
import java.util.*;
public class Item{
   private String name;
   private double price;
   private int quantity;
   private int bulkQuantity;
   private double bulkPrice;
   
   //constructor normal prices
   public Item(String name, double price){
      this.name = name;
      this.price = price;
      if(price < 0){
         throw new IllegalArgumentException("price must be positive");
      }
   }
   
   //constructor for bulk quantity
   public Item(String name, double price, int bulkQuantity, double bulkPrice){
      this.name = name;
      this.price = price;
      this.bulkQuantity = bulkQuantity;
      this.bulkPrice = bulkPrice;
      if(price < 0 || bulkQuantity < 0 || bulkPrice < 0){
         throw new IllegalArgumentException("all values must be positive");
      }
   
   }
   //returns the price of each item and calculates the bulkPrice if there is one
   public double priceFor(int quantity){
      if(quantity > bulkQuantity){
         return bulkPrice + (quantity - bulkQuantity) * price;
      }
      else{
         return quantity * price;
      }
   }
   //formats the text 
   public String toString(){
      NumberFormat nf = NumberFormat.getCurrencyInstance();
      String text = nf.format(price);
       
      return (name + ", " + text + "(" + bulkQuantity + " for " + bulkPrice + ")");
   }


}