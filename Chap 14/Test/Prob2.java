public class Prob2 {
   public int search(String[] arr, String target) {
      for(int i = 0; i < arr.length / 2; i++) {
         if(arr[i].equals(target) || arr[arr.length - 1 - i].equals(target)) {
            return i;
         }
      }
      return -1;
   }
}