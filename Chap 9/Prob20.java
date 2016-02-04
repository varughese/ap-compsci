public class Prob20 {

   public static int[][] pascalTriangle(int n) {
      int[][] t = new int[n][20];
      for(int i = 0; i < n; i++) {
         t[i] = new int[i+1];        
      }
      
      // Any explanation requires more in depth explanation than comments are capable of
      
      for(int j=0; j<t.length; j++) {
         for(int k=0; k<t[j].length; k++) {
            if(j==0 || k == t[j].length-1 || j==0 ) {
               t[j][k] = 1;
            } else {
               t[j][k] = t[j-1][k] + k;
            }
         }
      }
           
      return t;
   }
   
   public static void main(String[] args) {
   
      int[][] x = pascalTriangle(15);
            
      for(int r=0; r<x.length; r++) {
         
         for(int c=0; c<x[r].length; c++) {
            
            System.out.printf("%6d ", x[r][c]);
         }
         System.out.println();
      }
   }
}