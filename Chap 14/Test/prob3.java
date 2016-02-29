// num 3

public static void selectionSort(int[] a) {
   for(int n=1; n<a.length; n++) {
      for(int i=0; i<n; i++) {
         if(a[n] > a[i]) {
            swap(a, n, i);
         }
      }
   }
}