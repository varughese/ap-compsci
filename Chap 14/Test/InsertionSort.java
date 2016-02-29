// num 4

import java.util.Arrays;

public class InsertionSort {
   public static void insert(int[] a, int n, int x) {
      int i = n;
      while(i > 0 && x < a[i-1]) {
         a[i] = a[i-1];
         i--;
      }
      
      a[i] = x;
   }
 
   public static void sort(int[] a, int n) {
      if(n == a.length) {
         return;
      }
      
      insert(a, n, a[n]);
      sort(a, n+1);
   }  
   
   public static int[] x = {2,4,5,1,3,1,9,2,9,8};
   
   public static void main(String[] args) {
      sort(x, 1);
      System.out.println(Arrays.toString(x));
   }
}