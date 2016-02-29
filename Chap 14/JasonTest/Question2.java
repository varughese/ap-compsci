public class Question2 {
   
   public static int searchArray(int[] arr, int num){
      boolean searchingMin = true;
      int mid = arr.length/2;
      int maxNdx = arr.length-1;
      int minNdx = 0;
      while(minNdx != mid){
         if(searchingMin){
            if(arr[minNdx]==num){return minNdx;}
            searchingMin = false;
            minNdx++;
         } else {
            if(arr[maxNdx]==num){return maxNdx;}
            searchingMin = true;
            maxNdx--;
         }
      }
      
      return -1;      
   }
   
   public static void main(String[] args){
      int[] test = {1,6,2,5,0,8,7,9,11};
      System.out.println(searchArray(test,21));
   }
}