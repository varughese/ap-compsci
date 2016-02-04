public class Problem12 {


   public static int sumDigits(int n) {
      
      String numberAsString = n + "";
      
      int sum = 0;
      
      for(int i=0; i<numberAsString.length(); i++) {
        sum+=Character.getNumericValue(numberAsString.charAt(i));              
      }
      
      return sum;
   
   }
   
   public static void main(String[] args) {
   
      System.out.print(sumDigits(1111111111));
   
   }


}