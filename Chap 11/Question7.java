import java.util.*;

public class Question7 {
    public static void filter(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int i = 0;
        while(i < list1.size()) {
            int j = 0;
            boolean increase = true;
            while(j < list2.size()) {
                if(list1.get(i) == list2.get(j)) {
                    list1.remove(i);
                    increase = false;
                } else {
                    j++;
                    increase = true;
                }
            }
            if(increase) {
                i++;
            }
        }
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
        ArrayList<Integer> test2 = new ArrayList<Integer>();
        test2.add(1); 
        test2.add(2); 
        test2.add(3); 
        
        filter(test, test2);
        System.out.println(test);
    }
}