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
			
			int diff = w.compareTo(v);
			
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
	
	
}