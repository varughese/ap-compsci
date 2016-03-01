import java.util.Arrays;

public class Question4{
   
   public static void insert(int[] a, int n, int x) {
      int i = n;
      while(i > 0 && x < a[i-1]) {
         a[i] = a[i-1];
         i--;
      }
      
      a[i] = x;
   }
   
   public static void insertionSort(int[] a, int n){
      if(n == a.length){
         return;
      } else {
         insert(a, n, a[n]);
         insertionSort(a, n+1);
      }
   }
   
   public static void main(String[] args){
      int[] test = {3,9,1,8,2,4,0,11};
      insertionSort(test,1);
      System.out.println(Arrays.toString(test));
   }
}