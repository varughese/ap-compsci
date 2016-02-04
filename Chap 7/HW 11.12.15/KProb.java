public class KProb {


   public static void main(String[] args) {
   
   System.out.println(0.29 * 100);
   
   
      int k = 1;
      while(true) {
      
         int x  = (int)(k * 0.01 * 100);
         
         System.out.println("k: " + k + " | k * 0.01: " + (k*0.01) + " | k * 0.01 * 100: " + (k * 0.01 * 100) + " | x: " + x);
         
         if(x != k) {
         
            break;
         
         }
         
         k++;
      
      }
      
      System.out.print(k);
   
   
   
   }



}