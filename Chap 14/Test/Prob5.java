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
   
   static ArrayList<String> arr = new ArrayList<String>();
   
   public static ArrayList<String> mergeSort(ArrayList<String> list){
      
      if(list.size() == 1){
         ArrayList<String> temp = new ArrayList<String>();
         temp.addAll(list);
         //System.out.println(temp);
         return temp;
      } else {
         int mid = list.size()/2;
         
         ArrayList<String> left = new ArrayList<String>();
         ArrayList<String> right = new ArrayList<String>();
         
         if(mid == 0){
            left.add(list.get(0));
            right.add(list.get(1));
         } else {
            for(int i = 0; i < mid; i++){
               left.add(list.get(i));
            }
         
            for(int j = mid; j < list.size(); j++){
               //System.out.println(j);
               right.add(list.get(j));
            }
            
            //System.out.println(left);
            //System.out.println(right);
         
         }
         //mergeSort(right);
         mergeSort(left);
         mergeSort(right);
         //System.out.println(merge(mergeSort(left),mergeSort(right)));
         arr = merge(mergeSort(left),mergeSort(right));
         
      }
      return arr;
   }
   
   public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<String>();
      list1.add("Adam"); list1.add("Bob"); list1.add("Dylan"); list1.add("Frog");
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("Charles"); list2.add("Dan"); list2.add("Eggs"); list2.add("Ryan"); list2.add("Jason"); list2.add("ZA"); list2.add("ZB");
      
      //System.out.println(merge(list1, list2));
      
       ArrayList<String> unsorted = new ArrayList<String>();
       //unsorted.add("Zebras"); unsorted.add("Pancakes"); unsorted.add("Bananasw"); unsorted.add("Apples");

        
        //  System.out.println(mergeSort(unsorted));
   }
   
   
}