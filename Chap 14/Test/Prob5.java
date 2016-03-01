import java.util.ArrayList;

public class Prob5 {
   public static ArrayList<String> merge(ArrayList<String> list1, ArrayList<String> list2) {
      ArrayList<String> x = new ArrayList<String>();
      
      int list1counter = 0;
      int list2counter = 0;
      while(list1counter < list1.size() || list2counter < list2.size()) {
         
         int diff = 0;
         
         if(list1counter < list1.size() && list2counter < list2.size()) {
           diff = list1.get(list1counter).compareTo(list2.get(list2counter));
         } else {
           if(list1counter == list1.size()) {
              diff = 1;
           } else {
             diff = -1;
           }
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
   
   public static ArrayList<String> mergeSort(ArrayList<String> list) {
      int n = list.size();
      ArrayList<String> temp = new ArrayList<String>();
      recursiveSort(list, 0, n-1, temp);
      return temp;
   }
   
   private static void recursiveSort(ArrayList<String> a, int from, int to, ArrayList<String> temp) {
      if(to - from < 2) {
         if(to > from && a.get(to).compareToIgnoreCase(a.get(from)) > 0) {
            String t = a.get(to); a.set(to, a.get(from)); a.set(from, t);
         }
      } else {
         int middle = (from + to) / 2;
         recursiveSort(a, from, middle, temp);
         recursiveSort(a, middle + 1, to, temp);
         ArrayList<String> a1 = new ArrayList<String>();
         ArrayList<String> a2 = new ArrayList<String>();
         for(int i = from; i <= middle; i++) {
            a1.add(a.get(i));
         }
         for(int j = middle + 1; j <= to; j++) {
            a2.add(a.get(j));
         }
         ArrayList<String> res = merge(a1, a2);
          for(int k = from; k <= to; k++) {
             temp.add(res.get(k));
          }
      }
   }
   
   public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<String>();
      list1.add("Adam"); list1.add("Bob"); list1.add("Dylan"); list1.add("Frog");
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("Charles"); list2.add("Dan"); list2.add("Eggs"); list2.add("Ryan"); list2.add("Jason"); list2.add("ZA"); list2.add("ZB");
      
      //System.out.println(merge(list1, list2));
      
       ArrayList<String> unsorted = new ArrayList<String>();
       //unsorted.add("Zebras"); unsorted.add("Pancakes"); unsorted.add("Bananasw"); unsorted.add("Apples");

        
        //System.out.println(mergeSort(unsorted));
   }
   
   
}