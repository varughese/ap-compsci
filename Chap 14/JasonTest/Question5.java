import java.util.*;

public class Question5 {
   
   public static ArrayList<String> merge(ArrayList<String> list1, 
                                     ArrayList<String> list2){
                                     
      ArrayList<String> x = new ArrayList<String>();
      int list1Counter = 0;
      int list2Counter = 0;
      
      while(list1Counter < list1.size() && list2Counter < list2.size()){
         int diff = list1.get(list1Counter).compareTo(list2.get(list2Counter));
         
         if(diff < 0){
            x.add(list1.get(list1Counter));
            list1Counter++;
         } else {
            x.add(list2.get(list2Counter));
            list2Counter++;          
         }
         
         if(list1Counter == list1.size()){
            for(int i = list2Counter; i < list2.size(); i++){
               x.add(list2.get(i));
            }
         }
         
         if(list2Counter == list2.size()){
            for(int i = list1Counter; i < list1.size(); i++){
               x.add(list1.get(i));
            }
         }

         //System.out.println(x);
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
      
   public static void main(String[] args){
      ArrayList<String> test1 = new ArrayList<String>();
      ArrayList<String> test2 = new ArrayList<String>();
      ArrayList<String> test3 = new ArrayList<String>();
      
      test1.add("Daniel"); test1.add("Dylan"); 
      test2.add("Aardvark"); test2.add("Frog"); 
      test3.add("A"); test3.add("F"); test3.add("G"); test3.add("D"); test3.add("H"); test3.add("E"); test3.add("B"); test3.add("C"); test3.add("Z");
          
      System.out.println(merge(test1, test2));
      System.out.println(test3);
      System.out.println(mergeSort(test3));
   }
}