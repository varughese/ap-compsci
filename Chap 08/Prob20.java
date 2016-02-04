public class Prob20 {

   public static boolean isValidISBN(String isbn) {
      
      int sum = 0;
      
      for(int i=0; i<isbn.length(); i++) {
         
         int digit = Character.digit(isbn.charAt(i), 10);
         
         if((i+1)%2 == 0) {
            sum+= 3* digit;
         } else {
            sum += digit;
         }
         
      }
      
      return (sum%10 == 0);
   
   }
   
   public static void main(String[] args) {
   
      System.out.print(isValidISBN("9783161484100"));
      System.out.print(isValidISBN("9783161484300"));
   
   }

}