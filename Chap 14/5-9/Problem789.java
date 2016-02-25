/*
prob 5,6
5: If the target values are in the beginnign of the array
6a: 6
6b: 7
*/

public class Problem789 {
   public static int numOfXs(String s) {
      int high = s.length()-1, low = 0;
      while(low <= high) {
         int mid = (low + high)/2;
         if(s.charAt(mid) == 'X' && s.charAt(mid+1) == 'O') {
            return mid + 1;
         } else if(s.charAt(mid) == 'X') {
            low = mid + 1;
         } else {
            high = mid - 1;
         }
      
      }
      return 0;
   }
   
   public static int search(int[] a, int m, int n, int target) {
      if(m > n)
         return -1;
      
      int mid = (m+n)/2;
      if(a[mid] == target)
         return mid;
      else if(a[mid] > target)
         return search(a, mid+1, n, target);
      else
         return search(a, m, mid-1, target);   
      
   }
   
   // number 10: yes
   public static int rotatedBinarySearch(int[] a, int target) {
      int high = a.length -1; int low = 0;
      while(low <= high) {
         int mid = (high + low)/2;
         if(mid == 0 || mid == a.length -1) {
            low = (a.length - 1)/2;
         }
         
         if(a[mid] == target) {
            return mid;
         } else if(a[mid] < a[mid-1]) {
            if(a[mid] < target) {
               low = mid + 1;
               high = a.length - 1;
            } else if(a[mid] > target) {
               high = mid - 1;
               low = 0;
            }
         } else if(a[mid] > target) {
            high = mid - 1;
         } else if(a[mid] < target) {
            low = mid + 1;
         }
      }
      return -1;
   }
   
   
   public static void main(String[] args) {
      String v = "XXXXXOOO";
      //System.out.println(numOfXs(v));
      int[] a = {5,6,7,8,9,10,1,2,3};
      //System.out.println(search(a, 0, a.length, 26));
      System.out.println(rotatedBinarySearch(a, 7));
      
   }
}