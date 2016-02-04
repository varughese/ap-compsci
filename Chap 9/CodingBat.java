public class CodingBat {
   
   // ARRAY 1
   public int[] makePi() {
     int[] pi = {3,1,4};
     return pi;
   }
   
   // ARRAY 2
   public int countEvens(int[] nums) {
   int count = 0;
     for(int n : nums) {
       if(n % 2 == 0) count ++;
     }
     
     return count;
   }
   
   public String[] fizzBuzz(int start, int end) {
     String[] arr = new String[end - start];
  
     for(int i=0; i<end-start; i++) {
       int x = i + start;
       if(x % 3 == 0 && x % 5 == 0) {
         arr[i] = "FizzBuzz";
       } else if(x % 3 == 0) {
         arr[i] = "Fizz";
       } else if(x % 5 == 0) {
         arr[i] = "Buzz";
       } else {
         arr[i] = "" + x;
       }
     }
  
  return arr;
}

   
   // ARRAY 3
   public int maxSpan(int[] nums) {
     if(nums.length == 0) { return 0; }
     
     int max = 1;
     
     for(int s = 0; s <= nums.length / 2; s++) {
       for(int e = nums.length-1; e>s; e--) {
         if(nums[s] == nums[e]) {
           max = Math.max(max, e-s+1);
         }
       }
     }
     
     return max;
   }


   public boolean linearIn(int[] outer, int[] inner) {
     int i = 0;
     for(int number : outer) {
       if(i<inner.length && inner[i] == number) {
         i++;
       }
     }
     
     return i == inner.length;
     
   }

   public int[] squareUp(int n) {
     int result[] = new int[n * n];
     
     int fill = 1;
     for(int a=1; a<=n; a++) {
       for(int i=a*(n-1); i<result.length; i+=n) {
          result[i] = a;
       }
     }
   
     
     return result;
   }


}