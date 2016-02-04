import java.text.*;

public class Chap8Test {


   public static String yo() {
   
      int quantity = 7;
      double unitPrice = 1.466;
      
      DecimalFormat money = new DecimalFormat("0.00");
      
      String price = money.format(unitPrice);
      
      return "QTY " + quantity + " UNIT PRICE $" + price;
   
   }
   
   public static void toCanonicalForm(StringBuffer address) {
   
      for(int i = 0; i < address.length(); i++) {
      
         if(!Character.isLetterOrDigit(address.charAt(i))) {
            
            address.setCharAt(i, ' ');
         
         } else {
         
            address.setCharAt(i, Character.toUpperCase(address.charAt(i)));
            
         }
      
      }
   
   }


   public static void main(String[] args) {
 
      
      StringBuffer yo = new StringBuffer("asdadASD!!!!!!!!!ASD>><>!@#@$@<>");
      
      toCanonicalForm(yo);
      
      System.out.println(yo);
   }

}