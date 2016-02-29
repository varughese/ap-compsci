public class Question3{
   
   public static void selectionSort(int[] a){
      for(int n = a.length; n > 1; n--){
         for(int i = 1; i < n; i++){
            if(a[i]>a[i-1]){
               swap(a,i,i-1);
            }
         }
      }
   }
}