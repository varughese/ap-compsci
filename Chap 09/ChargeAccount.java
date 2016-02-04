public class ChargeAccount {

   public static boolean chargeNumber(int n) {
      int[] nums = {5658845,4520125,7895122,8777541,8451277,1302850,8080152,4562555,5552012,5050552,7825877,1250255,1005231,6545231,3852085,7576651,7881200,4581002};
      
      for(int c : nums) {
         if(n == c) {
            return true;
         }
      }
      
      return false;
      
   }
   
   public static void main(String[] args) {
      System.out.print(chargeNumber(7895122));
   }
}