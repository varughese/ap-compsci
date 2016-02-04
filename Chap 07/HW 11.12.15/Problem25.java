public class Problem25 {
     
   public static void makeChange(int amt) {
      // Tracks ordinal number for each combination
      int count = 1;
   
      // increase # of quarters each iteration
      for(int q = 0; q*25<=amt; q++) {
         // increase # of dimes each iteration
         for(int d = 0; q*25 + d*10<=amt; d++) {
            // increase # of nickels each iteration
            for(int n = 0; q*25 + d*10 + n*5<=amt; n++) {
               // set pennies to be whatever is left
               int p = amt - (q*25 + d*10 + n*5);
               
               // print is out nicely           
               System.out.printf("%4d. %3d quarters %3d dimes %3d nickels %3d pennies\n", 
                  count, q, d, n, p);               
            
               // increase ordinal number
               count++;
            }
         }
      } 
   
   }

   public static void main(String[] args) {
      
      makeChange(30);
              
   }

}