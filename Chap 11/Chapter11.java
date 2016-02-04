import java.util.*;

public class Chapter11 {
	// NUMBER 1
	public static ArrayList<String> concatenate(ArrayList<String> list1, ArrayList<String> list2) {
		ArrayList<String> concat = new ArrayList<String>();
		for(String num1_2 : list1) {
			concat.add(num1_2);
		}
		for(String num1_2: list2) {
			concat.add(num1_2);
		}
		return concat;
	}
	
	// NUMBER 2
	public static ArrayList<String> extract(ArrayList<String> list) {
		ArrayList<String> arr = new ArrayList<String>();
		
		int i = 0;
		while(i < list.size()) {
			if(list.get(i).length() <= 5) {
				arr.add(list.remove(i));
			} else {
				i++;
			}
		}
		
		return arr;
	}
	
	// NUMBER 3
	public static void toUpperCase(ArrayList<String> words) {
		int i = 0;
		for(String word : words) {
			words.set(i, word.toUpperCase());
			i++;
		}
	}
	
	// NUMBER 4
	public static ArrayList<Integer> primesBelow(int n) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
      arr.add(2);
      
      int i = arr.get(arr.size() -1) + 1;
      while(i <= n) {
         for(int j=0; j<arr.size(); j++) {
            if(i%arr.get(j) == 0) {
               i++;
               j=0;
            }
         }
         arr.add(i);
         i = arr.get(arr.size() -1) + 1;
      }
      
      arr.remove(arr.size() - 1);
      return arr;
	}
	
	// NUMBER 5
	// a
	public static void a_removeAll(ArrayList<Integer> indices, ArrayList<Object> list) {
		for(int i=0; i<indices.size(); i++)
			list.remove(indices.get(i) - i);
	}
	
	// b
	public static void b_removeAll(ArrayList<Integer> indices, ArrayList<Object> list) {
		for(int i=list.size()-1; i>=0; i--)
			if(indices.indexOf(i) > -1)
				list.remove(i);
	}
	
	public static void main(String[] args) {
      ArrayList<String> num1_1 = new ArrayList<String>();
      num1_1.add("A");num1_1.add("B");num1_1.add("C");
      ArrayList<String> num1_2 = new ArrayList<String>();
      num1_2.add("D");num1_2.add("E");num1_2.add("F");
      System.out.println(concatenate(num1_1, num1_2));
      
      System.out.println();
      
      ArrayList<String> num2 = new ArrayList<String>();
      num2.add("Blahblahblah");num2.add("Blah");num2.add("Bla");num2.add("Blahhahah");
      System.out.println(extract(num2));
      
      System.out.println();
      
      ArrayList<String> num3 = new ArrayList<String>();
      num3.add("Blahblahblah");num3.add("Blah");num3.add("Bla");num3.add("Blahhahah");
      toUpperCase(num3);
      System.out.println(num3);
      
      System.out.println();
      
      System.out.println(primesBelow(1000));
      
      
      System.out.println();
      
      ArrayList<Object> num5 = new ArrayList<Object>();
      num5.add("A");num5.add("B");num5.add("C");num5.add("D");num5.add("E");num5.add("F");
      ArrayList<Integer> indices = new ArrayList<Integer>();
      indices.add(0);indices.add(3);indices.add(4);
      a_removeAll(indices, num5);
      System.out.println(num5);
      
      System.out.println();
      
      ArrayList<Object> num6 = new ArrayList<Object>();
      num6.add("A");num6.add("B");num6.add("C");num6.add("D");num6.add("E");num6.add("F");
      indices.clear();
      indices.add(4);indices.add(0);indices.add(3);
      b_removeAll(indices, num6);
      System.out.println(num6);
      
   }
}