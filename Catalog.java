import java.util.*;
public class Catalog{
   private String name;
   private ArrayList <Item> list;
   //catalog constructor
   public Catalog(String name){
      this.name = name;
      list = new ArrayList<Item>();
   }
   //adds items to the list
   public void add(Item item){
      list.add(item);
   }
   //returns the size of the list
   public int size(){
      return list.size();
   }
   //returns the item at a given index
   public Item get(int index){
      if(index > list.size()){
         throw new IllegalArgumentException();
      }
      return list.get(index);
   }
   //returns name of the item
   public String getName(){
      return name;   
   }


}