// num 4

public class InsertionSort {
   public static void insert(int[] a, int n, int x) {
      int i = 1;
      while(i <= n && a[i] > a[i-1]) {
         i++;
      }
      int temp = a[n];
      a[n] = a[i];
      a[i] = temp;
   }
}