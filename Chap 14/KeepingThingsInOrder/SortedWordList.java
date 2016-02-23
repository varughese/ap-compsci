import java.util.ArrayList;

public class SortedWordList extends ArrayList<String> {
	private ArrayList<String> words;
	
	public SortedWordList() {
		words = new ArrayList<String>();
	}
	public SortedWordList(int c) {
		words = new ArrayList<String>(c);	
	}
	
	public boolean contains(Object obj) {
		return indexOf(obj) > -1;
	}
	
	public int indexOf(Object obj) {
		String w = (String)obj;

		int low = 0, high = words.size() - 1, ndx = -1;
		
		while(low < high) {
			int mid = (low + high)/2;
			
			String v = words.get(mid);
			
			int diff = w.compareToIgnoreCase(v);
			
			if(diff < 0) {
				high = mid - 1;
			} else if(diff > 0) {
				low = mid + 1;
			} else {
				return ndx;
			}
		}
		
		return ndx;
	}
   
   public String set(int i, String word) {
      int diff = -100;
      
      if(i == 0) {
         diff = word.compareToIgnoreCase(words.get(0));   
      } else {
         diff = words.get(i-1).compareToIgnoreCase(word);
      }
      
      if(diff >= 0)
         throw new IllegalArgumentException("word=" + word + " i=" + i);
         
      if(diff < 0) {
         words.set(i, word);
      }
      
      return word;
   }
   
   public void add(int i, String word) {
      
      if(i <= 0) {
         if(word.compareToIgnoreCase(words.get(0)) < 0) {
            words.add(0, word);
         }
         return;
      }
      
      if(i >= words.size()) {
         if(words.get(words.size()-1).compareToIgnoreCase(word) < 0) {
            words.add(words.size(), word);
         }
         return;
      }
       
      int p = words.get(i-1).compareToIgnoreCase(word);
      int n = word.compareToIgnoreCase(words.get(i));
      if(p >= 0 && n <= 0) {
         words.add(i, word);
      } else {
         throw new IllegalArgumentException("word=" + word + " i=" + i);
      }
      
      
      
        
   }
   
   public boolean add(String word) {
      int low = 0, high = words.size() - 1, mid = 0;
      while(low < high) {
         mid = (low + high) / 2;
         int diff = word.compareToIgnoreCase(words.get(mid));
         if(diff < 0) {
            high = mid -1;
         } else if(diff > 0) {
            low = mid + 1;
         } else {
            return false;
         }
      }
      words.add(mid, word);
      return true;
   }
   
	
	
}