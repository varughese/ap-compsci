public class Problem27 {
   
   public static void main(String[] args) {
      int count = 0;
      int y = 1;
      int x = 1;
      for(int i = 1; i<=100; i++) {
      
         x = i;
      
         for(int j = 1; j<= 100; j++) {
         
            y = j;
         
            if(1<=y && x<=100 && y<=x && j<=100) {
               count++;
            }
                     
         }
      
      } 
   
      System.out.print(count);
   
   }


}