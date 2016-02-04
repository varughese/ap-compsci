public class Prob5 {

   public static void main(String[] args) {
   
      String ccNumber = "4111 1111 1111 1111";
      
      String last4 = ccNumber.substring(ccNumber.length()-4);
      String last5 = ccNumber.substring(ccNumber.length()-5);

      System.out.print(last4);
   
   }

}