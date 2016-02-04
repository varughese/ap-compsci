import java.util.ArrayList;

public class Question5and6 {
   public static ArrayList<String> reverse(ArrayList<String> arr) {
      ArrayList<String> res = new ArrayList<String>(arr.size());


      for(int i = arr.size()-1; i>=0; i--) {
         res.add(arr.get(i));
      }

      return res;
   }

   public static void smallestRemove(ArrayList<Integer> arr) {
      int min = 9999999;
      int maxId = 0;

      for(int i=0; i<arr.size(); i++) {
         if(arr.get(i) < min) {
            min = arr.get(i);
            maxId = 0;
         }
      }

      arr.remove(maxId);

   }

   public static void main(String[] args) {
   ArrayList<Integer> test = new ArrayList<Integer>();
   test.add(1);
   test.add(2);
   test.add(3);
   test.add(4);
   test.add(5);
   test.add(6);
   test.add(7);
   ArrayList<String> test2 = new ArrayList<String>();
   test2.add("1");
   test2.add("2");
   test2.add("3");


   smallestRemove(test);


   System.out.println("TEST1 " + test);
   System.out.println("TEST2 " +  reverse(test2));

   }
}
