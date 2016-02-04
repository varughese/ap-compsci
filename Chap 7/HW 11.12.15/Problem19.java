public class Problem19 {
   
   public static void main(String[] args) {
   
      for(int i = 1; i <= 12; i++) {
      
         System.out.print("|");
      
         for(int j = 1; j <= 12; j++) {
         

            if(j*i - 100 >= 0) {
               System.out.print(j*i + " |");
            } else if(j*i - 10 >= 0) {
               System.out.print(j*i + "  |");
            } else {
               System.out.print(j*i + "   |");
            }
      
         }
     
         System.out.println("\n|----|----|----|----|----|----|----|----|----|----|----|----|");
      
      }
   
   }


}