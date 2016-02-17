public class Question7{
   
   public static int search(int[] a, int m, int n, int target) {
      if(a[m] == target){
         return m;
      } else if (m >= n) {
         return -1;
      } else {
         int mid = (int)((m+n)/2); //3
         return search(a,m+1,n,target);
         
      }
   }
   
   public static int searchBinary(int[] a, int m, int n, int target) {
      int mid = (int)((n+m)/2);
      if(a[mid]==target){
         return mid;
      } else if(a[mid] > target){
         return searchBinary(a,m,n/2,target);
      } else {
         return searchBinary(a,mid,n,target);
      }
   }
   
   public static void main(String[] args){
      int[] test = {1,3,5,7,9,11,15,17,19,20,28};
      System.out.println(searchBinary(test,1,8,17));
   }
}