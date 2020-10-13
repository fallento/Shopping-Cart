import java.util.*;
public class ReviewCollector{
   private ArrayList<ProductReview> reviewList;
   private ArrayList<String> productList;
   
   public ReviewCollector(){
      reviewList = new ArrayList<ProductReview>();
      productList = new ArrayList<String>();
   }
   public void addReview(ProductReview prodReview){
      reviewList.add(prodReview);
      String name = prodReview.getName();
      if(productList.size()>0){
         for(int i = 0; i < productList.size();i++){
            if(!name.equals(productList.get(i))){
               productList.add(name);
            }
         }
      }
   
   }
   public int getNumGoodReviews(String prodName){
      int sum = 0;
      if(reviewList.get(prodName).getReview().equals("best"))
         sum++;
      for(int i = 0; i < prodName.length();i++){	     
         if(reviewList.get(prodName).getReview().charAt(i).equals('b')&&reviewList.get(prodName).getReview().charAt(i).equals('e')&&reviewList.get(prodName).getReview().charAt(i).equals('s')&&reviewList.get(prodName).getReview().charAt(i).equals('t')){
            sum++;
         }
         if(sum > 0)
            return sum;
         else{
            return 0;
         }
      
      
      }
   
   }
}