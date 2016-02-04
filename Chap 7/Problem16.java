public class Problem16 {

   public static void main(String[] args) {
   
      int n = 37, b = 2;
      
      int p = 1;
      while(p <= n) {
      
         n-=p;
         p*=b;
      
      }
      
      System.out.print(n);
   
   }

}