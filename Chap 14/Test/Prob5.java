import java.util.ArrayList;

public class Prob5 {
   public static ArrayList<String> merge(ArrayList<String> list1, ArrayList<String> list2) {
      ArrayList<String> x = new ArrayList<String>();
      
      int list1counter = 0;
      int list2counter = 0;
      while(list1counter < list1.size() || list2counter < list2.size()) {
         
         int diff = 0;
         
         if(list1counter != list1.size() && list2counter != list2.size()) {
           diff = list1.get(list1counter).compareTo(list2.get(list2counter));
         } else {
            diff = list1counter - list2counter;
         }
         
         if(diff < 0) {
            x.add(list1.get(list1counter));
            list1counter++;
         } else {
            x.add(list2.get(list2counter));
            list2counter++;
         }
      }
      
      return x;
   }
   
   public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<String>();
      list1.add("Adam"); list1.add("Bob"); list1.add("Dylan"); list1.add("Frog");
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("Charles"); list2.add("Dan"); list2.add("Eggs"); list2.add("Ryan"); list2.add("Jason"); list2.add("ZA"); list2.add("ZB");
      
      System.out.println(merge(list1, list2));
   }
   
   
}