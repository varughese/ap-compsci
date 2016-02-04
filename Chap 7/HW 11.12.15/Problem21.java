public class Problem21 {
   
   
   public static void printCheckerboard(int n) {
      
      for(int y = 1; y <= n; y++) {
           
         for(int x = 1; x <= n; x++) {
         
            if((x + y) % 2 == 0) {               
               System.out.print("#");            
            } else {
               System.out.print("O");
            }
         
         }
       
         System.out.println("");
      }
   
   }
   
   
   public static void main(String[] args) {
   
      printCheckerboard(7);
   
   }


}